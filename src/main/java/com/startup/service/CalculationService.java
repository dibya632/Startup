package com.startup.service;

// TODO: Auto-generated Javadoc
/**
 * The Interface CalculationService.
 * 19/01/2020
 * 
 */
public interface CalculationService {

 /**
  * Area trangle.
  *
  * @param height the height
  * @param base the base
  */
 public void areaTrangle(double height, double base);

 /**
  * Multiplication.
  *
  * @param firstNumber the first number
  * @param secondNumber the second number
  */
 public void multiplication(int firstNumber,int secondNumber);
 
 /**
  * Modular.
  *22/01/2020
  * @param num the num
  * @param rem the rem
  */
 public void Modular(int x);
 
 /**
  * Odd even number.
  *
  * @param num the num
  * @OddEven number
  */
 public void OddEvenNumber(int num);
 
 
 /**
  * Cylinder parimeter.
  *
  * @param pi the pi
  * @param D the d
  * @param h the h
  */
 public void cylinderParimeter(int pi,int D,int h) ;
		

	//Add that to twice the height of the cylinder, and you'll have its perimeter.
	//
	//The formula is: P = 2 ( pi D +  h).
	//
	//Where D = diameter of the cylinder and h = height of cylinder.
 
 /**
	 * Squareof perimeter.
	 *
	 * @param a the a
	 */
	public void squareofPerimeter(int a);
 
	public void periTriangle(float x, float y, float z);
 
}

