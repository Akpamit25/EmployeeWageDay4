package com.capgemini;

public class UC9 {

	public static final int full_time=1;
	public static final int part_time=2;
	//public static final int emp_rate_per_hour=20;
	//public static final int working_days=20;
	//public static final int max_hours=100;
	
	public static int ABCCompanyWage() {
		int emp_rate_per_hour=20, working_days=20, max_hours=100;
		int empHours=0,totalHours=0;
		int empWage=0, totalWage=0;
		int empCheck=(int) Math.floor(Math.random() * 10)%3;
		for(int day=0; day<working_days; day++) {
			if(totalHours>=max_hours) {
				break;
			}
			switch(empCheck) {
				case full_time:
					empHours=8;
					totalHours+=empHours;
					break;
				case part_time:
					empHours=4;
					totalHours+=empHours;
					break;
				default:
					empHours=0;
			}
		
		}
		empWage=totalHours*emp_rate_per_hour;
		return empWage;
	}
	public static int XYZCompanyWage() {
		int emp_rate_per_hour=30, working_days=15, max_hours=80;
		int empHours=0,totalHours=0;
		int empWage=0, totalWage=0;
		int empCheck=(int) Math.floor(Math.random() * 10)%3;
		for(int day=0; day<working_days; day++) {
			if(totalHours>=max_hours) {
				break;
			}
			switch(empCheck) {
				case full_time:
					empHours=8;
					totalHours+=empHours;
					break;
				case part_time:
					empHours=4;
					totalHours+=empHours;
					break;
				default:
					empHours=0;
			}
		
		}
		empWage=totalHours*emp_rate_per_hour;
		return empWage;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Employee Wage for company ABC: "+ABCCompanyWage());
		System.out.println("Employee Wage for company XYZ: "+XYZCompanyWage());
	}

}