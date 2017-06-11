package com;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring the variables
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		
		//Taking input form the user
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of the byte and short");
		//Assigning the value to the variables
		
		
		
		a=sc.nextByte(); // Initialized the value of byte
		b=sc.nextShort(); //Initialized the value of short
		
		c=a+b; //Sum of byte and short
		System.out.println("The sum of byte and integer is = "+c);
		
		d=b+c; //sum of short and int
		System.out.println("The sum of short and int is = " +d); 
		 
		e=c+d;  //sum of int and long
		System.out.println("The sum of int and long is = "+e);
		
		f=d+e; //sum of float and long
		System.out.println("The sum of float and double =" +f);
		
	
		sc.close();
	

	}

}
