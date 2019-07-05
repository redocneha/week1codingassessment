package com.sapient.pe.model;

public class Account 
{
private final long   accountId;
private double accountBalance;

private static final double minaccountBalance =25_000;
private static long accountIdCounter = 100;
enum AccountType{
	SAVINGS_ACCOUNT,
	CURRENT_ACCOUNT,
	SALARIED_ACCOUNT;
	}

 private final Employee emp;
public long getAccountId() {
	return accountId;
}


public double checkBalance()
{
	return this.accountBalance;
}
public String getName() {
	return emp.getName();
}


public Account(Employee emp)
{
this.accountId = ++accountIdCounter;
this.emp=emp;

}
public void deposit(double amount)
{
this.accountBalance +=amount;
}
public void withdraw(double amount)
{	
if((this.accountBalance-amount)>=minaccountBalance)
{
this.accountBalance-=amount;

}
else
System.out.println("You do not have sufficient funds");

}

}