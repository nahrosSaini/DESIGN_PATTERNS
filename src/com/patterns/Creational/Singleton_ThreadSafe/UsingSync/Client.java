package com.patterns.Creational.Singleton_ThreadSafe.UsingSync;

public class Client {
    public static void main(String[] args){

        DBConnection myDBConnection1= DBConnection.getDBConnection();
        DBConnection myDBConnection2= DBConnection.getDBConnection();

        System.out.println("Connection : " + myDBConnection2);
        System.out.println("Connection : " + myDBConnection2);

        if(myDBConnection1==myDBConnection2){
            System.out.println("Connection is same object");
        }else{
            System.out.println("Connection is different object");
        }

    }
}
