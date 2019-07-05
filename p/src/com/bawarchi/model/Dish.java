package com.bawarchi.model;

public class Dish {
    
	private int id;
//	private static int idcounter=0;
	String name;
	double calories;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCalories() {
		return calories;
	}
	public void setCalories(double calories) {
		this.calories = calories;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	double price;
	public Dish(int id,String name,double price,double calories)
	
	{
		this.id=id;
		this.name=name;
		this.calories=calories;
		this.price=price;
	}
	
}
