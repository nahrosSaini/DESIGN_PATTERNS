package com.patterns.Creational.Builder;

public class Client {

    public static void main(String[] args){
        Student.StudentBuilder builder=new Student.StudentBuilder()
                .setStudentFName("Aoshan")
                .setStudentLName("Saini")
                .setStudentBatch("K5123")
                .setStudentAddress("jalandhar")
                .setStudentAge(23)
                .setStudentCollage("LPU")
                .setStudentPsp(8);

        Student newStudent=null;

        if(builder.checkValidStudent()){
            newStudent=builder.buildStudent();
        }

        if(newStudent==null){
            System.out.println("Student Not Created..!!");
        }else{
            System.out.println("Student Created : "+ newStudent);
        }

    }

}
/*

When to Use Builder Pattern
-------------------------------------
1. When the process involved in creating an object is extremely complex,
   with lots of mandatory and optional parameters.
2. When an increase in the number of constructor parameters leads to a large list of constructors.
3. When client expects different representations for the object that's constructed.

 */