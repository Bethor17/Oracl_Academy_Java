package com.tcca;

import java.util.Scanner;

public class CheckValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int value = 0;
		System.out.println("Type a number:");
		value = in.nextInt();
		
		if( value == 7)
		System.out.println("Youre lucky!");
		else if( value == 13)
		System.out.println("¡bad lucky!");
		else
		System.out.println("¡This is an ordinary number!");

	}

}
