package com.example.hamza.networkok.webservice;

import retrofit2.Retrofit;

/**
 * Created by hamza on 10/26/2017.
 */

public class FacultyServiceRESTClient {


    private static FacultyService facultyService;


    private FacultyServiceRESTClient() {

    }

    public static FacultyService getInstance() {

        if (facultyService == null) {

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://192.168.70.1/lara553/public/api/")
                    .build();

            facultyService = retrofit.create(FacultyService.class);

        }
        return facultyService;


    }


}
