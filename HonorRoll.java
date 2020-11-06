package com.tcca;

public class HonorRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int grade = 99;
		int numberDaysAbsent = 0;
		boolean madeHonorRoll = grade >= 88;
		
		if(madeHonorRoll)
		System.out.println("you are on the honor table");
		
		if(madeHonorRoll && numberDaysAbsent==0)
		System.out.println("You are able to get a scolarship");
				
		
		if(!madeHonorRoll && numberDaysAbsent<3)
			System.out.println("You are able to get a free class");
		
		if(grade > 70 && numberDaysAbsent < 5)//Dependiendo del valor se imprimira o no lo siguiente
			System.out.println("Youe are able to join sports team"); 
		
				
	}

}
