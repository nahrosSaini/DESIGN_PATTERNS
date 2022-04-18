package com.patterns.Creational.Singleton_ThreadSafe.UsingEnum;

public class Client {

    public static void main (String[] args){
        DBConnection connection1=DBConnection.CONNECTION;
        DBConnection connection2=DBConnection.CONNECTION;

        if(connection1==connection2){
            System.out.println("Connection objects are same..!!");
        }

    }

}
