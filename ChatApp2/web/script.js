let username = prompt("Enter username");

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

            let li=document.createElement("li");

            li.textContent=u;

            list.appendChild(li);

        });

    }
    else{

        showMessage(msg);

    }

};

function showMessage(msg){

    let chat = document.getElementById("messages");

    let div = document.createElement("div");

    div.classList.add("message");

    if(msg.startsWith("SYSTEM:")){

        div.style.textAlign="center";

        div.textContent=msg;

    }
    else if(msg.startsWith(username+":")){

        div.classList.add("me");

        div.textContent="Me: "+msg.split(": ")[1];

    }
    else{

        div.classList.add("other");

        div.textContent=msg;

    }

    chat.appendChild(div);

}

function sendMessage(){

    let input=document.getElementById("msg");

    if(input.value==="") return;

    let message=username+": "+input.value;

    socket.send(message);

    input.value="";

}
