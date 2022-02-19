package com.bridgelabz;

public class EmpWageCalcUC2 {
public static void main(String[] args) {
	
	final int emp_rate_per_hour=20;
	int is_fulltime=1;
	
	int empHrs=0;
	
	int salary=0;
	
	
	
	
	double empCheck=Math.floor(Math.random()*10) % 2;
	if(empCheck==is_fulltime)
		empHrs=8;
	else
		empHrs=0;
	
	salary= emp_rate_per_hour * empHrs;
	
	
	
System.out.println("Employee salary is "+salary);
}
}
