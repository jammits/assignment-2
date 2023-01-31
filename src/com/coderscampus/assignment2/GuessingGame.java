package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		//Need input, need target number, need while loop, 5 guesses, conditional for higher/lower/equal
		//Only use ints
		
		int numberOfGuesses = 0;
		
		Random target = new Random();
		
		int theRandomNumber = target.nextInt(100) + 1;
		System.out.println("random: "+ theRandomNumber);
		
		Scanner input = new Scanner(System.in);
		
		
		
		int userValue = 0;

		while(numberOfGuesses < 5) {
			
			System.out.print("Pick a number between 1 and 100 ");
			
			String userInput = input.nextLine();
			
			userValue = Integer.parseInt(userInput);
			
			if (userValue > 100 || userValue < 1) {
				System.out.println("Your guess is not between 1 and 100, please try again");
			}
			
			else {
				
				
				
				if (userValue == theRandomNumber) {
					System.out.println("You win!");
					break;
				}
				
				else {
						numberOfGuesses++;
						if (userValue < theRandomNumber) {
							System.out.println("Please pick a higher number");
	
						}
						else if(userValue > theRandomNumber) {
							System.out.println("Please pick a lower number");
	
						}
				}
			}
		}
		
		//Edge case checking if guess match on the 5th try
		if (userValue != theRandomNumber) {
			System.out.println("You lose, the number to guess was " + theRandomNumber);
		}
		

		
		input.close();
	}
}
