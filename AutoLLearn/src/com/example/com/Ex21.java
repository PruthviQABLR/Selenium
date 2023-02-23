package com.example.com;

import java.util.Scanner;

public class Ex21 {
	
	public void displayTemp()
	{
		System.out.println("Please enter the temperature: ");
		Scanner scan = new Scanner(System.in);
		int temp = scan.nextInt();
		
		if(temp>=25)
		{
			System.out.println("It's warm. Go outside...");
		}
		else if(temp>=8 && temp < 25)
		{
			System.out.println("The forecast is chilly. wear a coat.");
		}
		else if(temp<= -5)
		{
			System.out.println("The forecast is freezing! stay home");
		}
	}
	
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex21 testex21 = new Ex21();
		testex21.displayTemp();
		

	}

}
