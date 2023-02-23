package com.example.com;
import java.util.*;

public class StringReversal {
	
	class sentence {
		public void display()
		{
			System.out.println("Please enter the string you want to be revered: ");
			Scanner scan = new Scanner(System.in);
			String sentnce = scan.nextLine();
			
			// change the sentence to character
			
			char ch[] = sentnce.toCharArray();
			String rvrsentence = "";
			
			for(int i=sentnce.length()-1;i>=0;i--)
			{
				rvrsentence+=ch[i];
			}
			System.out.println("the reversed sentence is as below:");
			System.out.println(rvrsentence);
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReversal testStringReversal = new StringReversal();
		StringReversal.sentence testSentence= testStringReversal.new sentence();
		testSentence.display();

	}

}
