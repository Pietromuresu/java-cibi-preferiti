package org.lessons.java.array;

import java.util.Scanner;

public class CibiPreferiti {

	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			String[] favouriteFoods = {"Risotto gorgonzola radicchio e noci", "Pasta carbonara", "Bistecca (mid-done)", "Pizza margherita", "Hamburger", "Salmon Nigiri"};
			int favouriteFoodsLength = favouriteFoods.length;
			String fistFavouriteDish = favouriteFoods[0];
			String lastFavouriteDish = favouriteFoods[favouriteFoodsLength -1];
			String midFavouriteDish = null;
			
			
			
			if(!((favouriteFoodsLength % 2) == 0)) {
				midFavouriteDish = favouriteFoods[(favouriteFoodsLength - 1) / 2];
				
			}else {
				
				String firstChoice = favouriteFoods[(int)Math.floor((favouriteFoods.length - 1) / 2)];
				String secondChoice = favouriteFoods[(int)Math.floor((favouriteFoods.length) / 2)];
				System.out.println("Choose between: " + firstChoice +  "(1) " + " " + secondChoice +  "(2) ");
				String choosen = sc.nextLine();
				
				if(choosen.equals("1")) {
					midFavouriteDish = firstChoice;
				}else {
					midFavouriteDish = secondChoice;
				}
 				
					
			}
			
			
			sc.close();
			
			System.out.println("Array length: " + favouriteFoodsLength);
			System.out.println("First place: " + fistFavouriteDish);
			System.out.println("Last favourite: " + lastFavouriteDish);
			System.out.println("Mid favourite: " + midFavouriteDish);
		}
}
