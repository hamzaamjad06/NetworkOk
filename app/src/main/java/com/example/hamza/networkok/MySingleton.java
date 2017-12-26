package com.example.hamza.networkok;

/**
 * Created by hamza on 10/26/2017.
 */

public class MySingleton {
    private static final MySingleton ourInstance = new MySingleton();

    public static MySingleton getInstance() {
        return ourInstance;
    }

    private MySingleton() {
    }
}
