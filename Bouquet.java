package com.tcca;

public class Bouquet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] myBouquet = {"Rose","Sunflower","Daisy",
				"Dandelion","Violet", "Lily"};
				//use a for loop to iterate through the array
				for(int index = 0; index < myBouquet.length; index++){
				System.out.println(myBouquet[index]);
				}
				//use a for each to iterate through the array
				for (String myFlower : myBouquet){
				System.out.println(myFlower);

	}
	}
}
