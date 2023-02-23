package com.example.com;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chemistryGrade = 78;
		int englishGrade = 65;
		String language = "Java";
		
		if(chemistryGrade>75 || englishGrade>75 || language.equals("Java"))
		{
			System.out.println("congratulations, you got the scolarship");
		}
		else
		{
			System.out.println("sorry you didnt get the scolarship");
		}

	}

}
