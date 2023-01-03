package com.axis.food.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="food")
public class Food {

	@Id
	private int id;
	private String FoodName;
	private String Type;
	private int Price;
	private String status;
	private int quantity;
	
	
	
	public Food(int id, String foodName, String type, int price,String status, int quantity) {
		super();
	    this.id = id;
		this.FoodName = foodName;
		this.Type = type;
		this.Price = price;
		this.status = status;
		this.quantity = quantity;
	}

	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFoodName() {
		return FoodName;
	}


	public void setFoodName(String foodName) {
		FoodName = foodName;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", FoodName=" + FoodName + ", Type=" + Type + ", Price=" + Price + ", status="
				+ status + ", quantity=" + quantity + "]";
	}	
	
	
}
