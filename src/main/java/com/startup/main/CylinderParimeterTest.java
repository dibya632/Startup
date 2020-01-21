

package com.startup.main;

import java.util.Scanner;

import com.startup.serviceimpl.CalculationServiceImpl;

// TODO: Auto-generated Javadoc
/**
 * 21/01/2020
 * The Class CylinderParimeterTest.
 */
public class CylinderParimeterTest {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		CalculationServiceImpl obj=new CalculationServiceImpl();
		System.out.println("Enter the Number :");
		Scanner sc=new Scanner(System.in);
		int D=sc.nextInt();
		int h=sc.nextInt();
		int pi=22/7;
		obj.cylinderParimeter(pi, D, h);
	}

}
