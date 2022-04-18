package com.patterns.Creational.Singleton;

public class Client {

    public static  void main (String[] args){

        DBConnection myDBConnection1=DBConnection.getDbConnection();
        DBConnection myDBConnection2=DBConnection.getDbConnection();

        System.out.println("Connection : " + myDBConnection1.checkConnection());
        System.out.println("Connection : " + myDBConnection2.checkConnection());
        System.out.println("Connection : " + myDBConnection2);
        System.out.println("Connection : " + myDBConnection2);

        if(myDBConnection1==myDBConnection2){
            System.out.println("Connection is same object");
        }else{
            System.out.println("Connection is different object");
        }

        // the  above will always return a same DBConnection object everytime we request for it.
        // it will fail in multi-threading environment.
    }
}
