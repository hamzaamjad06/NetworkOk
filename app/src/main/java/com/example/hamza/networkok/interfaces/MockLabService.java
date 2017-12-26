package com.example.hamza.networkok.interfaces;

import com.example.hamza.networkok.models.Food;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by hamza on 10/22/2017.
 */

public interface MockLabService {

    @GET("/food")
    Call<List<Food>> getFood();


}
