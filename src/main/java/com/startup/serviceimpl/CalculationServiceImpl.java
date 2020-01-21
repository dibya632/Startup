package com.startup.serviceimpl;

import com.startup.service.CalculationService;

public class CalculationServiceImpl implements CalculationService {

	/**
	 * method for area of triangle
	 * @param height
	 * @param base
	 * @variable area to store area of triangle
	 */
	public void areaTrangle(double height, double base) {
		// TODO Auto-generated method stub
		//Area = (width*height)/2
	      double area = (base* height)/2;
	      System.out.println("Area of Triangle is: " + area);  
	      
	}

	public void multiplication(int firstNumber, int secondNumber) {
		int thirdNumber;
		thirdNumber=firstNumber*secondNumber;
		 System.out.println("Multiplication of two number: " +thirdNumber);
		
		
		
	}

	public void Modular(int num, int rem) {
		int modulo=2;
		if(rem==0) {
			System.out.println("This number is Even Number");
		}
		else {
			System.out.println("This number is Odd Number");
		}
		
	}
	/**
	 * implementation class of cube of a number 
	 * get number from main method
	 */

	public void cubeOfNumber(int number) {
		
		int cube=(number*number*number);
		System.out.println("Cube of a number="+cube);
		
		
	}

	public void OddEvenNumber(int num) {

		if(num%2==0) {
			System.out.println("The number is even Number");
		}
		else {
			System.out.println("This number is Odd Number");
		}
		
	}

	


}
