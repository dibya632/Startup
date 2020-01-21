package com.startup.main;

import java.util.Scanner;

import com.startup.serviceimpl.CalculationServiceImpl;

public class EvenOddNumber {
	
public static void main(String[] args) {
	 CalculationServiceImpl obj=new  CalculationServiceImpl();
	
	System.out.println("Enter the number :");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	 obj.OddEvenNumber(num);

	 
}
}
