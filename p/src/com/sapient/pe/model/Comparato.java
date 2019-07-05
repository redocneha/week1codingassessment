package com.sapient.pe.model;

import java.util.Comparator;

public  class Comparato {

	public enum CompType{
		NameSorter1,Idsorter1, CaloriesGT;
	}
		public static Comparator<Employee> getComparator(CompType ct)
		{
			switch(ct)
			{
			case NameSorter1:
				NameSorter ns=new NameSorter();
				return ns;
			
			case Idsorter1:
				EmpIdSorter is=new EmpIdSorter();
				return is;
				
				
				
			}
			return null;
	}
}
