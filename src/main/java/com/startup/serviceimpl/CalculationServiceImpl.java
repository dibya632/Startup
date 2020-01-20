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


}
