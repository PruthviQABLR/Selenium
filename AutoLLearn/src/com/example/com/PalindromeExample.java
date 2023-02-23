package com.example.com;

import java.util.Scanner;

public class PalindromeExample {
	
	public void checkPalindrome()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String you want to check: ");
		String txt = scan.next();
		String rvrtxt ="";
		
		for(int i =txt.length()-1;i>=0;i--)
		{
			rvrtxt = rvrtxt + txt.charAt(i);
		}
		System.out.println(rvrtxt);
		if(txt.equals(rvrtxt))
		{
			System.out.println("Hurray the given text is a palindrome");
		}
		else
		{
			System.out.println("Sorry the text you have entered is not a palindrome");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeExample testchk = new PalindromeExample();
		testchk.checkPalindrome();

	}

}
