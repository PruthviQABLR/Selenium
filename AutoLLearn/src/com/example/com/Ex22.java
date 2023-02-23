package com.example.com;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int gryffindor = 100;
		int ravenclaw = 500;
		
		if((gryffindor-ravenclaw)>=300)
		{
			System.out.println("Hurray GRYFFINDOR are the champions!!!!!");
		}
		else if((((gryffindor-ravenclaw))>=0) && (((gryffindor-ravenclaw) < 300)))
		{
			System.out.println("In Second place GRYFFINDOR");
		}
		else if(((gryffindor-ravenclaw)<=100) && ((gryffindor-ravenclaw) >=0))
		{
			System.out.println("In Third Place GRYFFINDOR");
		}
		else	
		{
			System.out.println("In Fourth Place is GRYFFINDOR");
		}


	}

}
