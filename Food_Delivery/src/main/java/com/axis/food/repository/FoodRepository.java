package com.axis.food.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.axis.food.bean.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer> {

	List<Food> findByName(String name);
	
	
}
