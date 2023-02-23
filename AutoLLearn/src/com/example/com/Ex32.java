package com.example.com;

import java.util.Scanner;

public class Ex32 {
	
	public void loanApproval()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("*****ROYAL BANK OF SCOTLAND******");
		System.out.println("Are you here to get a mortgage? (yes or no):");
		String userInput =  scan.nextLine().toLowerCase();
		
		switch(userInput)
		{
		case "yes": 
			System.out.println("\n Great ! how much money do you have in your savings? how much you owe for credit card? " +
					" "+" (please enter in a single line");
					
					int userSavings = scan.nextInt();
					int userCredit = scan.nextInt();
					
					System.out.println("\n how many years have you worked for");
					int userExp = scan.nextInt();
					
					System.out.println("What is your name:");
					scan.nextLine();
					String userName = scan.nextLine();
					
					if(userSavings>=10000 && userCredit< 5000 && userExp > 2)
					{
						System.out.println("Congratulations "+userName+" you have been approved");
					}
					else
					{
						System.out.println("Sorry,"+userName+" you are not eligible for a mortgage");
					}
			break;
		case "no" : 
			System.out.println("Ok, have a nice day.....");
			break;
		default: System.out.println("sorry you have entered wrong information.....");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex32 testEx32 = new Ex32();
		testEx32.loanApproval();

	}

}
