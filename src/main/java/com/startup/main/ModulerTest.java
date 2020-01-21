package com.startup.main;

import java.util.Scanner;

import com.startup.serviceimpl.CalculationServiceImpl;

/**
 * 20/01/2020
 * The Class Test for 
 * Moduler
 */
public class ModulerTest {
	public static void main(String[] args) {
		CalculationServiceImpl obj=new CalculationServiceImpl();
		System.out.println("Emter the number :");
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		int rem=sc.nextInt();
	obj.Modular(num, rem);
	}

}
