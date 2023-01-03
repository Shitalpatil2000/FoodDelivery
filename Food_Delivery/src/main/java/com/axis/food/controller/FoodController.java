package com.axis.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.food.bean.Food;
import com.axis.food.service.FoodServiceImp;
import com.axis.food.service.IFoodService;

@RestController
@RequestMapping("/api/v1/food")

public class FoodController {

	@Autowired
	IFoodService service;
	
	
	
	@PostMapping("/add")
	public Food  addFood(@RequestBody Food food) {
		
		boolean isValid = FoodServiceImp.isValidFoodData(food);
		
		Food food2 =null;
		
		if(isValid) {
			food2 = service.addFood(food);
		}
		
		return food2;
		
	}
	
	
	@PostMapping("/update")
	public Food  updateFood(@RequestBody Food food) {
		
		boolean isValid = FoodServiceImp.isValidFoodData(food);
		
		Food food2 =null;
		
		if(isValid) {
			food2 = service.addFood(food);
		}
		
		return food2;
		
	}
	
	@GetMapping("/get/fname/{fname}")
	public List<Food> getByName(@PathVariable String name){
		return service.getFoodByName(name);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id){
        
		return service.deleteFoodById(id);
		
	}
	
	@GetMapping("/get")
	public List<Food> getAll(){
		return service.getAllFood();
		
	}
}
