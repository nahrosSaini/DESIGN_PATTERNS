package com.patterns.Creational.Singleton_ThreadSafe.UsingSync;

public class DBConnection {
    private static volatile DBConnection dbConnection;

    private DBConnection(){};
    // we are using synchronized block instead of synchronized keyword at method
    // to reduce the overhead on performance
    // synchronization is required only at first time when object is created post that we don't need.
    public static DBConnection getDBConnection(){
        if(dbConnection==null){
            synchronized (DBConnection.class){
                if(dbConnection==null){
                    dbConnection=new DBConnection();
                }
            }
        }

        return dbConnection;
    }
}
