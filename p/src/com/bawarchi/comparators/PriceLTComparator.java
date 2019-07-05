package com.bawarchi.comparators;

import java.util.Comparator;

import com.bawarchi.model.Dish;

public class PriceLTComparator implements  Comparator<Dish> {

	public int compare(Dish d1,Dish d2)
	{
		return (int)(d1.getPrice()-d2.getPrice());
	}
}
