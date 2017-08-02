package com.verma.amit.singletondemo;

/**
 * Created by amit.verma on 02-08-2017.
 */

public class Singleton {
    private static Singleton mInstance;
    private String username;
    //no outer class can initialize this class's object
    private Singleton() {}

    public static Singleton Instance()
    {
        //if no instance is initialized yet then create new instance
        //else return stored instance
        if (mInstance == null)
        {
            mInstance = new Singleton();
        }
        return mInstance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
