package com.example.com;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String option = "cash";
		boolean comparison = (option.equals("cash") || option.equals("credit"));
		System.out.println(comparison);
		
		boolean comparison1 = !(option.equals("cash") || option.equals("credit"));
		System.out.println(comparison1);
		
		String option1 = "neither";
		boolean comparison3 = (option1.equals("cash") || option1.equals("credit"));
		System.out.println(comparison3);
		
		String option2 = "neither";
		boolean comparison4 = !(option2.equals("cash") || option2.equals("credit"));
		System.out.println(comparison4);

	}

}
