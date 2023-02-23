package com.example.com;
import java.util.*;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter what day is it today: ");
		Scanner scan = new Scanner(System.in);
		String userInput = scan.next();
		
		if(userInput.equalsIgnoreCase("holiday"))
		{
			System.out.println("Woohoo its a holiday, no work!!");
		}
		else if(userInput.equalsIgnoreCase("sunday") || userInput.equalsIgnoreCase("saturday"))
		{
			System.out.println("Its a weekend, no work");
		}
		else
		{
			System.out.println("wake up at 7.00");
		}

	}

}
