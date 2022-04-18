package com.patterns.Creational.EnhancedBuilder;

public class Student {
    private String fName;
    private String lName;
    private String address;
    private String batch;
    private String collage;
    private int age;
    private int psp;
    // Construct-ers

    // getters

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getAddress() {
        return address;
    }

    public String getBatch() {
        return batch;
    }

    public String getCollage() {
        return collage;
    }

    public int getAge() {
        return age;
    }

    public int getPsp() {
        return psp;
    }

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    public static class StudentBuilder{

        private Student student;

        StudentBuilder(){
            student=new Student();
        }

        public StudentBuilder setStudentFName(String fName){
            student.fName=fName;
            return this;
        }

        public StudentBuilder setStudentLName(String lName){
            student.lName=lName;
            return this;
        }

        public StudentBuilder setStudentAddress(String address){
            student.address=address;
            return this;
        }

        public StudentBuilder setStudentBatch(String batch){
            student.batch=batch;
            return this;
        }

        public StudentBuilder setStudentAge(int age){
            student.age=age;
            return this;
        }

        public StudentBuilder setStudentPsp(int psp){
            student.psp=psp;
            return this;
        }

        public StudentBuilder setStudentCollage(String collage){
            student.collage=collage;
            return this;
        }

        public StudentBuilder checkValidStudent(){
            if(student.fName.startsWith("A") && student.psp<10){
                return this;
            }

            return null;
        }

        public Student buildStudent(){

            return student;

        }
    }
}
