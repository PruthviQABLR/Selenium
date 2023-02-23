package com.example.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassDataDriven {
	
	public void display() {
		List<Integer> ls = new ArrayList<Integer>();
		List<Integer> finalls = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of elements to be added in the list: ");
		int val = scan.nextInt();
		
		System.out.println("Please enter the numbers to be added into the list: ");
		
		for(int i =0;i<val;i++)
		{
			int a = scan.nextInt();
			ls.add(a);
		}
		for(Integer num : ls)
		{
			if(num%2==0)
			{
				finalls.add(num);
			}
		}
		System.out.println("The list of even numbers are as below:");
		System.out.println(finalls);
	    
		
	}

    
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassDataDriven testclassDataDriven = new ClassDataDriven();
		testclassDataDriven.display();
		

	}

}
