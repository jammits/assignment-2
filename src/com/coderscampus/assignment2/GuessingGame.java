package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		//Need input, need target number, need while loop, 5 guesses, conditional for higher/lower/equal
		//Only use ints
		
		int numberOfGuesses = 1;
		
		Random target = new Random();
		
		int theRandomNumber = target.nextInt(100) + 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Pick a number between 1 and 100 ");
		
		String userInput = input.nextLine();
		
		int userValue = Integer.parseInt(userInput);

		while((userValue != theRandomNumber) && (numberOfGuesses < 5)) {
			
			if (userValue > 100 || userValue < 1) {
				System.out.println("Your guess is not between 1 and 100, please try again");
			}
			else {
				if (userValue < theRandomNumber) {
					System.out.println("Please pick a higher number");
					numberOfGuesses++;
				}
				else if(userValue > theRandomNumber) {
					System.out.println("Please pick a lower number");
					numberOfGuesses++;
				}
			}
			userValue = Integer.parseInt(input.nextLine());

		}
		
		//Edge case checking if guess match on the 5th try
		if (numberOfGuesses == 5 && userValue != theRandomNumber) {
			System.out.println("You lose, the number to guess was " + theRandomNumber);
		}
		
		if (userValue == theRandomNumber) {
			System.out.println("You win!");
		}
		
		input.close();
	}
}
