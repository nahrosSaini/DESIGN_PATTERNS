package com.patterns.Creational.Singleton;

public class DBConnection {
    private static DBConnection dbConnection;

    private DBConnection(){};

    public static DBConnection getDbConnection(){

        if(dbConnection==null){
            dbConnection=new DBConnection();
        }

        return dbConnection;
    }

    public String checkConnection(){
        if(dbConnection!=null){
            return "Connection is Alive..!!";
        }

        return "Connection is Dead..!!";
    }
}
