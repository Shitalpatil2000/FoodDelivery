package com.axis.food.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.axis.food.bean.Food;
import com.axis.food.repository.FoodRepository;
import com.axis.medical.entity.Medicine;

public class FoodServiceImp implements IFoodService {

	@Autowired
	FoodRepository repo;
	
	
	@Override
	public Food addFood(Food food) {
		// TODO Auto-generated method stub
		return repo.save(food);
	}

	@Override
	public Food updateFood(Food food) {
		// TODO Auto-generated method stub
		return repo.save(food);
	}

	@Override
	public List<Food> getFoodByName(String name) {
		// TODO Auto-generated method stub
		return repo.findByName(name);
	}
	
	@Override
	public ResponseEntity<String> deleteFoodById(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return new ResponseEntity<String> ("Record deleated ",HttpStatus.OK);
	}

	@Override
	public List<Food> getAllFood() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	
public static boolean  isValidFoodData(Food food) {
		
		boolean flag = false;
		
		if(food.getFoodName() != null && food.getFoodName().length() > 3) {
			
			flag = true;
			
			
		}
		return flag;
   }
}
