package com.example.com;

import java.util.Scanner;

public class WorkBook43 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the value to be converted: ");
		double userInputF = scan.nextInt();
		System.out.println("The Fahrenheit to celcius is as below :");
		System.out.println(tempConverter(userInputF));

	}
	
	public static double tempConverter(double fahrenheit)
	{
		double celcius = (fahrenheit -32) * 5/9;
		return celcius;
	}

}
