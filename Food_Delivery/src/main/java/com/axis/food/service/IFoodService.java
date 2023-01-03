package com.axis.food.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.axis.food.bean.Food;

public interface IFoodService {

	
	public Food addFood(Food food);
	public Food updateFood(Food food);
	public List<Food> getFoodByName(String name);
	public ResponseEntity<String> deleteFoodById(int id);
	public List<Food> getAllFood();
	
	
}
