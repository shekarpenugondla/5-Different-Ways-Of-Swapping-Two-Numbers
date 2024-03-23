package com.tech.swap;

import java.util.Scanner;

public class UsingThirdVariable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a value");
		int a=scan.nextInt();
		System.out.println("enter b value");
		int b=scan.nextInt();
		int temp;
	    temp=a;
	    a=b;
	    b=temp;
	    System.out.println("a value is: "+a);
	    System.out.println("b value is: "+b);
	   
		
	}


}
