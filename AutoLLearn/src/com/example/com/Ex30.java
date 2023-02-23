package com.example.com;
import java.util.*;

public class Ex30 {
	
	public void display()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter two integers on the same line: ");
		int num1= scan.nextInt();
		int num2= scan.nextInt();
		System.out.println(num1+" "+num2);
		
		System.out.println("Please enter two big integers on the same line:");
		long bignum1=scan.nextLong();
		long bignum2 = scan.nextLong();
		System.out.println(bignum1+" "+bignum2);
		
		System.out.println("Please enter two decimals on the same line:");
		double decimal1 = scan.nextDouble();
		double decimal2 = scan.nextDouble();
		System.out.println(decimal1 +" "+decimal2);
		
		System.out.println("Please enter two text values on the same line:");
		String txt1 = scan.next();
		String txt2 = scan.next();
		System.out.println(txt1+" "+txt2);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex30 testEx30 =  new Ex30();
		testEx30.display();
		

	}

}
