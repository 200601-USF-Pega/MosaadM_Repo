package com.company;

import java.lang.reflect.Array;
        import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        Student stu1 = new Student(001,"John Smith", 1);
        Student stu2 = new Student(002, "Osman Alwan", 3);
        Student stu3 = new Student(003, "Navin Mathew", 2);
        Student[] schoolDB={stu1,stu2, stu3};
        try{
            System.out.println(schoolDB[0]);
            System.out.println(schoolDB[1]);
            System.out.println(schoolDB[2]);
            System.out.println(schoolDB[3]);
        } catch (Exception e){
            System.out.println("error");
        }




    }
}
