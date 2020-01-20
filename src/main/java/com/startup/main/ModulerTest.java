package com.startup.main;

import java.util.Scanner;

/**
 * 20/01/2020
 * The Class Test for 
 * Moduler
 */
public class ModulerTest {
	public static void main(String[] args) {
		System.out.println("Emter the number :");
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
	   int rem=num%10;
	   System.out.println("The Modular value is :"+rem);
	}

}
