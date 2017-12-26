package com.example.hamza.networkok;

import com.example.hamza.networkok.models.Food;

import java.util.List;

/**
 * Created by hamza on 10/22/2017.
 */

class FoodEvent {

    private List<Food> foodList;

    public FoodEvent(List<Food> foods) {

        foodList = foods;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }
}
