package com.startup.main;

import com.startup.serviceimpl.CalculationServiceImpl;

public class CubeOfNumber {
/**
 * create main method for cube of a number
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculationServiceImpl cubeOf=new CalculationServiceImpl();
		cubeOf.cubeOfNumber(5);

	}

}
