package com.patterns.Creational.EnhancedBuilder;

public class Client {

    public static void main(String[] args){
        try{
            Student student=Student.getBuilder()
                    .setStudentFName("Roshan")
                    .setStudentLName("Saini")
                    .setStudentBatch("K5123")
                    .setStudentAddress("jalandhar")
                    .setStudentAge(23)
                    .setStudentCollage("LPU")
                    .setStudentPsp(8).checkValidStudent().buildStudent();


            if(student==null){
                System.out.println("Student Not Created..!!");
            }else{
                System.out.println("Student Created : "+ student);
            }

        }catch (NullPointerException ne){
            System.out.println("Failed to created Student :  validation failed");
        }catch (Exception e){
            System.out.println("Error goes :: "+e);
        }


    }

}
