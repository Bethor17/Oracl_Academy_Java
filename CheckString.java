package com.tcca;

import java.util.Scanner;

public class CheckString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String name = "";
		System.out.println("Type your name:(Elvis or Michael Jackson or SomeoneElse Name");
		name = in.next();
		if( name.equals("Elvis"))
		System.out.println("Youre the Rock n' Roll's King!");
		else if( name.equals("Michael Jackson"))
		System.out.println("Youre the king of pop!");
		else
		System.out.println("Youre not the kink");

	}

}
