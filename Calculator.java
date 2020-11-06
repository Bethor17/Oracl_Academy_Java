package com.tcca;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int answer = 0;
		System.out.println("Type a number:");
		int num1 = in.nextInt();
		System.out.println("Type another one:");
		int num2 = in.nextInt();
		System.out.println("Enter an operation like *,/,%,+,-:");
		char input = in.next().charAt(0);
		switch (input){
		case '*' :
		answer = num1 * num2;
		break;
		case '/' :
		answer = num1 / num2;
		break;
		case '%' :
		answer = num1 % num2;
		break;
		case '+' :
		answer = num1 + num2;
		break;
		case '-' :
		answer = num1 - num2;
		break;
		default:
		System.out.println("Invalid simbol.");
		}
		System.out.println("Answer: " + answer);

	}

}
