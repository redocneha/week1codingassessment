package com.bawarchi.comparators;

import java.util.Comparator;




import com.bawarchi.model.Dish;
import com.sapient.pe.model.Comparato.CompType;

public class Comparato1 {

public enum CompType
{
	CaloriesGT,CaloriesLT,PriceGT,PriceLT;
}
public static Comparator<Dish> getComparator(CompType ct)
{
	switch(ct)
	{
	case CaloriesGT:
		CaloriesGTComparator cGT=new CaloriesGTComparator();
		return cGT;
	    
	case CaloriesLT:
		CaloriesLTComparator cLT=new CaloriesLTComparator();
		return cLT;
		
	case PriceGT:
		PriceGTComparator pGT=new PriceGTComparator();
		return pGT;
		
	case PriceLT:
		PriceLTComparator pLT=new PriceLTComparator();
		return pLT;
		
		
		
	}
	return null;
}
}
