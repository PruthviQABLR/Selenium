package com.example.com;
import java.util.*;


public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("please enter the day: ");
		Scanner scan = new Scanner(System.in);
		String userInput = scan.next();
		String day = userInput.toLowerCase();
		System.out.println("Hey are you free on "+day);
		
		System.out.println("Hmmmm let me check my calender");
		
		switch(day)
		{
		case "monday":System.out.println("Cant"); break;
		case "tuesday":System.out.println("Busy"); break;
		case "wednesday":System.out.println("lets do it");break;
		case "thursday": System.out.println("yeah");break;
		case "friday" : System.out.println("perhaps"); break;
		case "saturday" :System.out.println("sure"); break;
		case "sunday" : System.out.println("Certainly"); break;
		default:
			System.out.println("you have asked me a wrong day");
		}
	

	}

}
