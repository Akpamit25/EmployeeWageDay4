package com.capgemini;

public class UC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isFullTime=1;
		int empCheck=(int)Math.floor(Math.random()*10)%2;
		if (empCheck==isFullTime)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}

}
