package com.example.com;

import java.util.Scanner;

public class InterviewEx002 {
	
	public void replace()
	{
		System.out.println("Please enter a string or a word:");
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		
		System.out.println("Please enter the word to be replaced:");
		String replaceWord = scan.next();
		
		System.out.println("Please enter the new word:");
        String newWord = scan.next();
        
		if (sentence.contains(replaceWord))
		{
			System.out.println("Yes the word is there.");
			System.out.println("Lets try to change it.........");
			sentence =sentence.replace(replaceWord, newWord);
			System.out.println(sentence);
		}
		else
		{
			System.out.println("Sorry you have entered a wrong word");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterviewEx002 testinterviewEx002 = new InterviewEx002();
		testinterviewEx002.replace();

	}

}
