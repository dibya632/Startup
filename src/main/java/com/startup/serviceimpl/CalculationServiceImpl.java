package com.startup.serviceimpl;

import com.startup.service.CalculationService;

// TODO: Auto-generated Javadoc
/**
 * The Class CalculationServiceImpl.
 */
public class CalculationServiceImpl implements CalculationService {

	/**
	 * method for area of triangle.
	 *
	 * @param height the height
	 * @param base the base
	 * @variable area to store area of triangle
	 */
	public void areaTrangle(double height, double base) {
		// TODO Auto-generated method stub
		//Area = (width*height)/2
	      double area = (base* height)/2;
	      System.out.println("Area of Triangle is: " + area);  
	      
	}

	/* (non-Javadoc)
	 * @see com.startup.service.CalculationService#multiplication(int, int)
	 */
	public void multiplication(int firstNumber, int secondNumber) {
		int thirdNumber;
		thirdNumber=firstNumber*secondNumber;
		 System.out.println("Multiplication of two number: " +thirdNumber);
		
		
		
	}

	/* (non-Javadoc)
	 * @see com.startup.service.CalculationService#Modular(int, int)
	 */
	public void Modular(int num, int rem) {
		int modulo=2;
		
		
	}
	
	/**
	 * implementation class of cube of a number 
	 * get number from main method.
	 *
	 * @param number the number
	 */

	public void cubeOfNumber(int number) {
		
		int cube=(number*number*number);
		System.out.println("Cube of a number="+cube);
		
		
	}

	/* (non-Javadoc)
	 * @see com.startup.service.CalculationService#OddEvenNumber(int)
	 */
	public void OddEvenNumber(int num) {

		if(num%2==0) {
			System.out.println("The number is even Number");
		}
		else {
			System.out.println("This number is Odd Number");
		}
		
	}
	

	/* (non-Javadoc)
	 * @see com.startup.service.CalculationService#CylinderParimeter(int, int, int)
	 * 21/01/2020
	 */
	public void CylinderParimeter(int pi, int D, int h) {
	int P;
	P = 2* ( pi *D +  h);
	System.out.println("The Parimeter Cylinder is"+P);
		
	}

	


}
