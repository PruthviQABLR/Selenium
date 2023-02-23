package com.example.com;

import java.util.Scanner;

public class Ex33 {
	
	public void quizDisplay()
	
	{
		int actualScore = 20;
		int userScore=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("*****JAVA QUIZ*****");
		System.out.println("1. Which country held the 2016 summer olympics?");
		System.out.println("\ta) China\n \tb) ireland\n \tc) Brazil\n \td) Italy\n ");
		String questionA = scan.next().toLowerCase();
		if (questionA.equals("c"))
			userScore += 5; 
			
		
		System.out.println("2. Which planet is the hottest?");
		System.out.println("\ta) Venus\n \tb) Saturn\n \tc) Mercury\n \td) Mars\n");
		String questionB = scan.next().toLowerCase();
		if (questionB.equals("a"))
			userScore += 5; 
		
		System.out.println("3. What is the rarest blood type?");
		System.out.println("\ta) O\n \tb) A\n \tc) B\n \td) AB -Negative\n");
		String questionC = scan.next().toLowerCase();
		if (questionC.equals("d"))
			userScore += 5; 
		
		System.out.println("4. Which one of the characters is friend with harry potter?");
		System.out.println("\ta) Ron Weasley\n \tb) Hermonie Granger\n \tc) Draco malfoy\n");
		String questionD = scan.next().toLowerCase();
		if (questionD.equals("b"))
			userScore += 5; 
		
		
		System.out.println("your final score is :"+userScore+"/"+actualScore);
		if(userScore>10)
		{
			System.out.println("good you know your stuff");
		}
		else
		{
			System.out.println("you better get serious and start studying");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex33 testex33 = new Ex33();
		testex33.quizDisplay();

	}

}
