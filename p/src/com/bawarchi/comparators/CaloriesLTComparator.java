package com.bawarchi.comparators;

import java.util.Comparator;

import com.bawarchi.model.Dish;

public class CaloriesLTComparator implements Comparator<Dish> {

	public int compare(Dish d1,Dish d2)
	{
		return (int)(d2.getCalories()-d1.getCalories());
	}
}
