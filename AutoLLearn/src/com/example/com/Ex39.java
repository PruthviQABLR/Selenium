package com.example.com;

public class Ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double area1 = calArea(12.5,44.5);
		System.out.println(area1);
		
		if(returnBoolean())
		{
			System.out.println("the code runs");
		}
		else
		{
			System.out.println("No code runs");
		}
		
	}
		
		public static double calArea(double length, double height)
		{
			double area = length * height;
			return area;
		}
		
		public static boolean returnBoolean()
		{
			return false;
		}

}
