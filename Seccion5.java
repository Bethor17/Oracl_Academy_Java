package com.tcca;

import java.util.Scanner;

public class Seccion5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean quit = false;
		int num1 = 10, num2 = 6, answer = 0;
		char operand = ' ';
		Scanner in = new Scanner(System.in);
		do {
		System.out.println("Please enter a mathematic character");
		String input = in.next();
		char operand1 = input.charAt(0);
		switch(operand1) {
		case '*':
		answer = num1 * num2;
		break;
		case '+':
		answer = num1 + num2;
		break;
		case '-':
		answer = num1 - num2;
		case '/':
		answer = num1 / num2;
		default:
		System.out.println("Invalud number.");
		}
		System.out.println("Quit? Y/N");
		if(in.next().equalsIgnoreCase("Y"))
		quit=true;
		} while(!quit);

	}

}
