package com.sapient.pe.client;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.sapient.pe.model.Address;
import com.sapient.pe.model.Comparato;
import com.sapient.pe.model.CurrentAccount;
import com.sapient.pe.model.Employee;
import com.sapient.pe.model.SalariedAccount;
import com.sapient.pe.model.SavingAccount;
import com.sapient.pe.model.SupAccount;


public class Client {
	enum CompType{
		NameSorter1,Idsorter1;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello");
		System.out.println("Choose any action");
		
		boolean b=false;
		List<SupAccount> accountsSet=new ArrayList<SupAccount>();
		List<Employee> l=new ArrayList<Employee>();
				
		int d=0;
		int r=0;
		
		do {
			System.out.println("1.new account\n 2.existing \n 3.Sort By Name\n 4.Sort By Employee id\n 5.Sort By AccountId\n");
			int v=sc.nextInt();
		switch(v) {
		
		case 1:
			System.out.println("enter the type of account \n 1.Salaried \n 2.Saving \n 3.Current\n");
			int c=sc.nextInt();
			
			System.out.println("Enter the city name");
			String city=sc.next();
			System.out.println("Enter the city PIN");
			int pin=sc.nextInt();
			Address adr=new Address(city,pin);
			System.out.println("Enter the Employee name");
			String name=sc.next();
			
			System.out.println("Enter the salary");
		     int salary=sc.nextInt();
					   
						Employee emp=new Employee(name,salary,adr);
						switch(c) {
					case 1: 
						SalariedAccount sa= new SalariedAccount(emp);
					  
					    accountsSet.add(sa);
					    l.add(emp);
					    
					    break;
					    
					case 2:
						
						SavingAccount sav=new SavingAccount(emp);
				
					 accountsSet.add(sav);
					 l.add(emp);
					
						break;
					
				   case 3:
					    
					    CurrentAccount ca=new CurrentAccount(emp);
					   
					    
					    accountsSet.add(ca);
					    l.add(emp);
					    break;
		
						}
						System.out.println("do u want to continue y(1) no (0)");
						d=sc.nextInt();
			
		  break;
		
		case 2:
			System.out.println("enter the account id");
			long h=sc.nextLong();
			Long g= new Long(h);
			for(SupAccount sa:accountsSet)
			{
				Long da=new Long(sa.getAccountId());
				if(da.equals(g)) {
					
			
			System.out.println("view\n 2.deposit\n3.withdraw");
			int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			double hg=sa.checkBalance();
			System.out.println("account balance"+hg);
			
			
			break;
		case 2:
			System.out.println("enter the amount to be deposited");
			double dep=sc.nextInt();
			sa.deposit(dep);
			
			break;
		case 3:
			System.out.println("enter the amount to be withdraw");
			double am=sc.nextInt();
			sa.withdraw(am);
			
			break;
	}
			r=1;
		}
				
	
			}
			if(r==0)
				System.out.println("incorrect details");
			break;
		
		
		case 3:
	   
		
			Collections.sort(l,Comparato.getComparator(Comparato.CompType.NameSorter1));
			
		   Iterator<Employee> it=l.iterator();
		   while(it.hasNext())
		   {
			   System.out.println(it.next().getName());
		   }
		   
		   
			break;
			
		case 4:
			   
			
			Collections.sort(l,Comparato.getComparator(Comparato.CompType.Idsorter1));
			
		   Iterator<Employee> it1=l.iterator();
		   while(it1.hasNext())
		   {
			   System.out.println(it1.next().getId());
		   }
		   
		   
			break;
		
		
		}}while(d==1);
		
		}
	
		
		
		



	



	private static long f(SupAccount sa) {
		// TODO Auto-generated method stub\
		Scanner sc=new Scanner(System.in);
	
		int d=0;
		do {
			System.out.println("view\n 2.deposit\n3.withdraw");
			int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			double hg=sa.checkBalance();
			System.out.println("account balance"+hg);
			System.out.println("do u want to continue y(1) no (0)");
			
			d=sc.nextInt();
			
;			break;
		case 2:
			System.out.println("enter the amount to be deposited");
			double dep=sc.nextInt();
			sa.deposit(dep);
			System.out.println("do u want to continue y(1) no (0)");
			d=sc.nextInt();
			break;
		case 3:
			System.out.println("enter the amount to be withdraw");
			double am=sc.nextInt();
			sa.withdraw(am);
			System.out.println("do u want to continue y(1) no (0)");
			d=sc.nextInt();
			break;
	}}while(d==1);
	
		return sa.getAccountId();
		
	 
	}


		
		
		
		
	

	
	}


