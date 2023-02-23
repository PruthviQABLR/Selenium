package com.example.com;

import java.util.Scanner;

import io.netty.util.internal.SystemPropertyUtil;

public class Ex29 {
	
	public void displayDealership()
	{
		System.out.println("Welcome to the JAVA Dealership");
		System.out.println("Select option 'a' to buy a car");
		System.out.println("Select option 'b' to sell a car");
		
		
		Scanner scan = new Scanner(System.in);
		String option = scan.nextLine().toLowerCase();
		
		switch(option)
		{
		case "a" : 
			System.out.println("What is your budget");
			int budget = scan.nextInt();
			if(budget >=10000)
			{
				System.out.println("great, a nissan ultima is available");
				System.out.println("Do you have insurance(say yes or no)");
				scan.nextLine();
				String insurance = scan.nextLine().toLowerCase();
				System.out.println("Do you have driver licence?(say yes or no)");
				String licence = scan.nextLine().toLowerCase();
				System.out.println("what is your credit score?");
				int creditScore = scan.nextInt();
				if((insurance.equals("yes") && licence.equals("yes") && creditScore > 660))
				{
					System.out.println("Sold, Pleasure doing business with you");
				}
				else
				{
					System.out.println("We are sorry, you are not eligible.");
				}
			}
			else
			{
				System.out.println("sorry we dont sell cars under 10000");
			}
		          break;
		case "b" : 
			System.out.println("\nwhat is the actual car value?");
			int actualValue = scan.nextInt();
			
			System.out.println("\nwhat is the selling price of the car?");
			int sellingValue = scan.nextInt();
			
			if(actualValue>sellingValue && sellingValue<30000)
			{
				System.out.println("Deal we will buy the car");
			}
			else
			{
				System.out.println("Sorry we are not interested....");
			}
			     break;
			default:
				System.out.println("Sorry you have entered a wrong value...");
		}
		scan.close();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex29 testex29 =  new Ex29();
		testex29.displayDealership();
		
		

	}

}
