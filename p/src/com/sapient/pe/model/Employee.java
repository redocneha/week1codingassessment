package com.sapient.pe.model;

import java.util.Comparator;


public class Employee {
  private long id;
  private String name;
  private int salary;
  private int vacationDays=30;
  private  Address adr;
  private static long empIdCounter = 100;
  public Employee(String name,int salary,Address adr)
  {
	  this.id = ++empIdCounter;
	 
	  this.adr=adr;
	  this.name=name;
	  this.salary=salary;
  }
  public long getId() {
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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getVacationDays() {
	return vacationDays;
}
public void setVacationDays(int vacationDays) {
	this.vacationDays = vacationDays;
}
 public void applyForLeave(int noOfDays) {
	 if(vacationDays>=noOfDays)
		 vacationDays-=noOfDays;
	 else
		 System.out.println("You don't have enough leaves");
 }

}
class EmpIdSorter implements Comparator<Employee>
{
	
	public int compare(Employee e1,Employee e2)
	{
		return Integer.valueOf((int)e1.getId()).compareTo((int)e2.getId());
	}
	
}
class NameSorter implements Comparator<Employee>
{
	
	public int compare(Employee e1,Employee e2)
	{
		return String.valueOf(e1.getName()).compareTo(e2.getName());
	}
}