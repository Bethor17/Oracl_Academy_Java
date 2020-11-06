package com.tcca;

import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = in.next();
		System.out.println("Enter a number:");
		int answer = in.nextInt();
		System.out.println(name + ", the number you entered is: " + answer);


	}

}
