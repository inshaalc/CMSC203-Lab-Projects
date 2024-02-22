/*
		* Class: CMSC203 
		 * Instructor: Khandan Monshi
		 * Description: Assignment 1 requires writing a program 
		 * that utilizes a random number generator in a game that 
		 * fetches a different color after every guess that a user makes.
		 * Due: 02/05/2024
		 * Platform/compiler: Eclipse IDE
		 * I pledge that I have completed the programming assignment 
		 *independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
		 * Print your Name here: Inshaal Chaudhury
*/
import java.util.Scanner;
import java.util.Random;

// Primary class
public class ESPGame 
{
	// Main method
	public static void main(String[] args) 
	{
		
		//Name
		System.out.print("Enter your name: ");
		Scanner name = new Scanner (System.in);
		String name1 = name.nextLine();
		
		// M#
		System.out.print("Enter your M#: ");
		Scanner m = new Scanner (System.in);
		String mNum = m.nextLine();
		
		// Description
		System.out.print("Describe yourself: ");
		Scanner description = new Scanner (System.in);
		String description1 = description.nextLine();
		
		// DueDate
		System.out.print("Due Date: ");
		Scanner due = new Scanner (System.in);
		String dueDate = due.nextLine();
		System.out.println("");
		
		final String red = "Red";
		final String blue = "Blue";
		final String green = "Green";
		final String yellow = "Yellow";
		final String orange = "Orange";
		final String purple = "Purple";
		final String white = "White";
		
		// Random number generator
		Random randomNum = new Random();
		
		String selectedColor = " ";
		int totalCorrectGuesses = 0;
		
		// For loop for 11 rounds
		for (int i = 0; i < 11; i++)
		{
			System.out.println("Round " + (i + 1));
			System.out.println("");
			System.out.println("I am thinking of a color.");
			System.out.println("Is it Red, Blue, Green, Yellow, Orange, Purple or White?");
			System.out.print("Enter your guess: ");
			Scanner keyboard = new Scanner(System.in);
						
			int number = randomNum.nextInt(7);
			
			// Switch statement: used for random number generator
			switch(number)
			{
				case 0:
					selectedColor = red;
					break;
				case 1: 
					selectedColor = blue;
					break;
				case 2: 
					selectedColor = green;
					break;
				case 3:
					selectedColor = yellow;
					break;
				case 4:
					selectedColor = orange;
					break;
				case 5:
					selectedColor = purple;
					break;
				case 6: 
					selectedColor = white;
					break;
			}
			
			// Initialize bool value for input validation in do-while loop to false 
			boolean validGuess = false;
			
			// Do-while loop: applies input validation and has counter for all 
			// correct guesses
			do
			{
				String userGuess = keyboard.nextLine();
				
				// input validation
				if (userGuess.equalsIgnoreCase("red") || userGuess.equalsIgnoreCase("blue") 
						|| userGuess.equalsIgnoreCase("green") || userGuess.equalsIgnoreCase("yellow")
						|| userGuess.equalsIgnoreCase("orange") || userGuess.equalsIgnoreCase("purple") 
						|| userGuess.equalsIgnoreCase("white"))
				{
					validGuess = true;
					// counter
					if (userGuess.equalsIgnoreCase(selectedColor))
					{
							totalCorrectGuesses++;
					}
				}
				else
				{
					System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, Purple, or Yellow?");
					System.out.print("Enter your guess again: ");
				}
			} while (!validGuess);
			
			
			System.out.println("");
			System.out.println("I was thinking: " + selectedColor);
			
		}	
		// all output once game is over
		System.out.println("\nGame Over");
		System.out.println("");
		System.out.println("You guessed " + totalCorrectGuesses + " out of 11 colors correctly.");
		System.out.println("Student Name: " + name1);
		System.out.println("User Description: " + description1);
		System.out.println("Due Date: " + dueDate);
		
		// all scanners are closed
		name.close();
	    m.close();
	    description.close();
	    due.close();
	}
}