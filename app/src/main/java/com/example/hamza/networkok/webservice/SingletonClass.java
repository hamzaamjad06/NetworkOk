package com.example.hamza.networkok.webservice;

/**
 * Created by hamza on 10/26/2017.
 */

public class SingletonClass  {

    private static SingletonClass sSoleInstance;

    private SingletonClass(){}  //private constructor.

    public static SingletonClass getInstance(){
        if (sSoleInstance == null){ //if there is no instance available... create new one
            sSoleInstance = new SingletonClass();
        }

        return sSoleInstance;
    }
}
