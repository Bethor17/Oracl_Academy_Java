package com.tcca;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int repeat = 0;
		int sum = 0;
		do{
		System.out.println("enter a number");
		int input = in.nextInt(); //user inputs a number
		sum+=input; //add user input to sum
		System.out.println("Want to add more numbers?");
		System.out.println("Enter 1 for yes or 2 for no:");
		repeat = in.nextInt();
		} while(repeat==1);
		System.out.println("The sum of the numbers are: " + sum);

	}

}
