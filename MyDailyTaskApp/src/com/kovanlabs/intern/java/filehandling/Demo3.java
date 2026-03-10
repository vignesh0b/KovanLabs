package com.kovanlabs.intern.java.filehandling;

import java.io.*;

public class Demo3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Serializable
        FileOutputStream fos = new FileOutputStream("new.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student s1 = new Student();

        oos.writeObject(s1);

        oos.close();

        //Deserializable

        FileInputStream fis = new FileInputStream("new.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s2 = (Student) ois.readObject();
        System.out.println(s2.name+" "+s2.rollno);

    }
}
