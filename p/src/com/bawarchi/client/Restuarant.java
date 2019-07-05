package com.bawarchi.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.bawarchi.comparators.Comparato1;
import com.bawarchi.model.Dish;


public class Restuarant {
	static List<Dish> dishlist=new ArrayList<Dish>();
 public static void main(String args[])
 {
	 populateData();
	 System.out.println("=================Welcome=====================");
	 System.out.println(" Please choose from the below options ");
	 System.out.println("1 => To sort the dishes in the increasing order of calories\r\n" + 
	 		"   2 => To sort the dishes in the decreasing order of calories\r\n" + 
	 		"   3 => To sort the dishes in the increasing order of price\r\n" + 
	 		"   4 => To sort the dishes in the decreasing order of price ");
	 
	 Scanner sc=new Scanner(System.in);
	 int choice=sc.nextInt();
	 switch(choice)
	 {
	 case 1:
		 Collections.sort(dishlist,Comparato1.getComparator(Comparato1.CompType.CaloriesGT));
			
		   Iterator<Dish> it1=dishlist.iterator();
		   System.out.println("=================Please select the Dish Id and hit enter===============================");
			
			   while(it1.hasNext())
			   {
				   Dish f=it1.next();
				   System.out.println("DishId  "+f.getId()+"name   "+f.getName()+"price  "+f.getPrice()+"calories   "+f.getCalories());
			   }
	 case 2:
		 Collections.sort(dishlist,Comparato1.getComparator(Comparato1.CompType.CaloriesLT));
			
		   Iterator<Dish> it2=dishlist.iterator();
		   System.out.println("=================Please select the Dish Id and hit enter===============================");
			
			   while(it2.hasNext())
			   {
				   Dish f=it2.next();
				   System.out.println("DishId   "+f.getId()+"name    "+f.getName()+"price    "+f.getPrice()+"calories   "+f.getCalories());
			   }
		   break;
	 case 3:
		 Collections.sort(dishlist,Comparato1.getComparator(Comparato1.CompType.PriceGT));
			
		   Iterator<Dish> it3=dishlist.iterator();
		   System.out.println("=================Please select the Dish Id and hit enter===============================");
			 
			   while(it3.hasNext())
			   {
				   Dish f=it3.next();
				   System.out.println("DishId   "+f.getId()+"name  "+f.getName()+"price  "+f.getPrice()+"calories  "+f.getCalories());
			   }
		   break;
	 case 4:
		 Collections.sort(dishlist,Comparato1.getComparator(Comparato1.CompType.PriceLT));
			
		   Iterator<Dish> it4=dishlist.iterator();
		   System.out.println("=================Please select the Dish Id and hit enter===============================");
			
			   while(it4.hasNext())
			   {
				   Dish f=it4.next();
				   System.out.println("DishId  "+f.getId()+"name  "+f.getName()+"price  "+f.getPrice()+"calories  "+f.getCalories());
			   }
		 break;
	 }
	 
	   int chose=sc.nextInt();
	   int y=0;
	   Iterator<Dish> it8=dishlist.iterator();
	   Dish j=null;
	   while(it8.hasNext())
	   {
		   j=it8.next();
		  if(j.getId()==chose) {
			  System.out.println(" ==========You have selected  ====================="+j.getName());
         y=1;
			  break;
         }
		  
		
	   }
	   if(y==1)
	   {
		   System.out.println("Please enter your name: ");
		   String name=sc.next();
		   double amountToPay=j.getPrice();
		   System.out.println("Please pay the bill of "+amountToPay);
		   double paid=sc.nextDouble();
		   if(paid>amountToPay)
			   System.out.println(" ========Thanks for your order. Please collect the change =  ================"+(paid-amountToPay));
		   else if(paid<amountToPay)
			   System.out.println("========Amount paid is less than Bill Amount ================");
		   else
			   System.out.println("========Thanks for your order. ================ ");

 }
	   else
		   System.out.println("Incorrect id");
	 
 }
 public static void populateData()
 {
	 Dish d1=new Dish(5,"Neer-Dosa",50.00,100);
	 Dish d2=new Dish(2,"Idli-Vada",40.00,200);
	 Dish d3=new Dish(4,"Roti-Curry",100.00,250);
	 Dish d4=new Dish(1,"Dosa",50.00,300);
	 Dish d5=new Dish(3,"Pulav",80.00,330);
	 
	 dishlist.add(d1);
	 dishlist.add(d2);
	 dishlist.add(d3);
	 dishlist.add(d4);
	 dishlist.add(d5);
 }



	
}
