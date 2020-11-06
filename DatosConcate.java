package com.tcca;

import java.util.Scanner;

public class DatosConcate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("insert the number of Cm to convert :");
		double mtr =sc.nextDouble();
		
		double cm =mtr*100;
		
		System.out.println("El numero total de centimetros son : "+cm+" ");
	

}