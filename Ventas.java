package com.tcca;

import java.util.Scanner;

public class Ventas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("How many libraries you bought?");
		int sales = in.nextInt();
		switch(sales){
		case 6: System.out.println("You Won  $1000");
		case 5: System.out.println("You Won A Motorcycle");
		case 4: System.out.println("You won A Smart Phone");
		case 3: System.out.println("You Won A Nintendo");
		case 2: System.out.println("You Won A Car");
		case 1: System.out.println("You won A watch");
		break;
		default: System.out.println("no Price");

	}
	}
}
