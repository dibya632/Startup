package com.startup.main;

import java.util.Scanner;

import com.startup.serviceimpl.CalculationServiceImpl;

public class SquareofPerimeterTest {

	public static void main(String[] args) {
		CalculationServiceImpl obj = new CalculationServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int perimeter;
		perimeter = sc.nextInt();
		obj.squareofPerimeter(perimeter);
	}

}
