package com.cognifyz.task1;
import java.util.*;
import java.util.Random;
/*
 * Task 1: Text-Based Game - Number Guessing Game
 *
 * Game Rules:
 * - The computer randomly selects a number between 1 and 100.
 * - The player must guess the number.
 * - After each guess, the game provides feedback:
 *   - "Too low" if the guess is less than the target.
 *   - "Too high" if the guess is greater than the target.
 *   - "Correct" if the guess matches the target.
 * - The game continues until the player guesses correctly.
 * - The total number of attempts is displayed at the end.
 *
 * Game Logic:
 * - Use Random to generate a number.
 * - Use Scanner to take input.
 * - Use if-else to compare guesses.
 * - Use a loop to repeat until correct.
 * - Use a counter to track attempts.
 */
public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Welcome to the Number Guessing Game !");
        System.out.println("Guess a number between 1 and 100:");
        int attempts=0;
        int numberToGuess=random.nextInt(100)+1;
        while(true) {
        	int Guess=sc.nextInt();
        	if(Guess>numberToGuess) {
        		System.out.println("Too high! Try again:");
        		attempts++;
        	}
        	else if(Guess<numberToGuess){
        		System.out.println("Too low! Try again:");
        		attempts++;
        	}
        	else {
        		System.out.println("Congratulations! You guessed it in "+attempts+"attempts");
        		break;
        	}
        }
        
    }
}
