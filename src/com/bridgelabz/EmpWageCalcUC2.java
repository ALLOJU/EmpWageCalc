package com.bridgelabz;

public class EmpWageCalcUC2 {
public static void main(String[] args) {
	
	final int emp_rate_per_hour=20;
	
	final int full_day_hour=8;
	
	int salary=0;
	
	
	
	
	double empCheck=Math.floor(Math.random()*10) % 2;
	
	salary= emp_rate_per_hour * full_day_hour;
	
	
	
System.out.println("Employee salary is "+salary);
}
}
