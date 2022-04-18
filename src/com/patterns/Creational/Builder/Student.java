package com.patterns.Creational.Builder;

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

    public static class StudentBuilder{
        private String fName;
        private String lName;
        private String address;
        private String batch;
        private String collage;
        private int age;
        private int psp;

        public StudentBuilder setStudentFName(String fName){
            this.fName=fName;
            return this;
        }

        public StudentBuilder setStudentLName(String lName){
            this.lName=lName;
            return this;
        }

        public StudentBuilder setStudentAddress(String address){
            this.address=address;
            return this;
        }

        public StudentBuilder setStudentBatch(String batch){
            this.batch=batch;
            return this;
        }

        public StudentBuilder setStudentAge(int age){
            this.age=age;
            return this;
        }

        public StudentBuilder setStudentPsp(int psp){
            this.psp=psp;
            return this;
        }

        public StudentBuilder setStudentCollage(String collage){
            this.collage=collage;
            return this;
        }

        public boolean checkValidStudent(){
            if(fName.startsWith("A") && psp<10){
                return true;
            }

            return false;
        }

        public Student buildStudent(){
                Student newStudent=new Student();
                newStudent.fName=this.fName;
                newStudent.lName=this.lName;
                newStudent.address=this.address;
                newStudent.age=this.age;
                newStudent.batch=this.batch;
                newStudent.collage=this.collage;
                newStudent.psp=this.psp;

                return newStudent;

        }
    }
}
