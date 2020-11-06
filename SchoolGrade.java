package com.tcca;

import java.util.Scanner;

public class SchoolGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			Scanner in = new Scanner(System.in);
			System.out.println("¿in which grade are you in?");
			int grade = in.nextInt();
			switch(grade){
			case 9: System.out.println("are you a first year student");
			break;
			case 10: System.out.println("are you a second year student");
			break;
			case 11: System.out.println("You are a Junior");
			break;
			case 12: System.out.println("You are a Senior");
			break;
			default: System.out.println("Invalud Grade");
			}

	}

}
