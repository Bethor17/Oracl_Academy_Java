package com.tcca;

import java.util.Scanner;
public class LoopFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int numInputs = 10;	int sum = 0;
		for(int i = 0; i < numInputs; i++){
		int input = in.nextInt(); //user inputs a number
		if(input % 2 == 0) //if it's even
			continue;
		}
		System.out.println("The sum of those ten numbers is: " + sum);
		
		
	}

}
