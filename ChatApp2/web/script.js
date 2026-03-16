let username = localStorage.getItem("username");

if(!username){

window.location.href="login.html";

}

document.getElementById("chatHeader").innerText =
"Group Chat - " + username;

let socket = new WebSocket("ws://localhost:8080");

socket.onopen = () => {

socket.send("JOIN:"+username);

};

socket.onmessage = (event) => {

let msg = event.data;

if(msg.startsWith("USERS:")){

let users = msg.replace("USERS:","").split(",");

let list = document.getElementById("users");

list.innerHTML="";

users.forEach(u=>{

let li = document.createElement("li");

let avatar = document.createElement("div");
avatar.classList.add("user-avatar");
avatar.textContent = u.charAt(0).toUpperCase();

let name = document.createElement("span");
name.classList.add("username");
name.textContent = u;

li.appendChild(avatar);
li.appendChild(name);

list.appendChild(li);

});

}
else{

showMessage(msg);

}

};

function showMessage(msg){

let chat=document.getElementById("messages");

let div=document.createElement("div");

div.classList.add("message");

if(msg.startsWith("SYSTEM:")){

    div.classList.add("system");

    div.textContent = msg.replace("SYSTEM: ","");

}
else if(msg.startsWith(username + ":")){

div.classList.add("me");

div.textContent="Me: " + msg.split(": ")[1];

}
else{

div.classList.add("other");

div.textContent=msg;

}

chat.appendChild(div);

chat.scrollTop = chat.scrollHeight;

}

function sendMessage(){

let input=document.getElementById("msg");

let message=username+": "+input.value;

socket.send(message);

input.value="";

}

function exitChat(){

if(socket){
socket.close();
}

localStorage.removeItem("username");

window.location.href="login.html";

}
