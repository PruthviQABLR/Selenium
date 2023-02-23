package com.example.com;

import java.util.Scanner;

public class InterviewEx001 {
	
	public void display()
	{
		System.out.println("Please enter the string or word:");
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		String revsentence = " ";
		
		char[] ch = sentence.toCharArray();	
		
		for(int i = sentence.length()-1;i>=0;i--)
		{
			revsentence+= ch[i];
		}
		System.out.println("The Reversed sentence is as below:");
		System.out.println(revsentence);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterviewEx001 testInterviewex001 = new InterviewEx001();
		testInterviewex001.display();

	}

}
