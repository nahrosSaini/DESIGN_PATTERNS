package com.patterns.Creational.Singleton_ThreadSafe.UsingEnum;

public enum DBConnection {
    CONNECTION;

    public String checkConnection(){
        return "Connection is good";
    }
}
