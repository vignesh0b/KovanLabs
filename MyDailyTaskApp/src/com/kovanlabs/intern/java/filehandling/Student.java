package com.kovanlabs.intern.java.filehandling;

import java.io.Serializable;

public class Student implements Serializable{
    String name;
    int rollno;

    Student(){
        this.name="vignesh";
        this.rollno=101;
    }
}
