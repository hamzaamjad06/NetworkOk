package com.example.hamza.networkok;

import com.example.hamza.networkok.webservice.FacultyService;

import retrofit2.Retrofit;

/**
 * Created by hamza on 10/26/2017.
 */

public class RetrofitFacultyClient {
    private static FacultyService ourInstance;

    public static FacultyService getInstance() {

        if (ourInstance == null) {

            Retrofit retrofit = new Retrofit.Builder().baseUrl("http://192.168.70.1/lara553/public/api/hostel/2")
                    .build();

            ourInstance = retrofit.create(FacultyService.class);
        }

        return ourInstance;


    }

    private RetrofitFacultyClient() {
    }
}
