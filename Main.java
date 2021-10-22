// My script package
//package com.spentcoast.practice;

// Imports Scanner
import java.util.Scanner;

// Makes the Main class
public class Main {
	
	// Creates a public static function called user_input with a return type of String
	public static String user_input(String var1) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter " + var1 + ": "); // Prints the input phrase

	    String output = myObj.nextLine();  // Read user input and sets it to output
		
		return output; // outputs output
	}
	
	// The main function
	public static void main(String[] args) {
		String name = user_input("name"); // Inputs "name" to user_input
		String time = user_input("certain time"); // Inputs "certain time" to user_input
		String minutes = user_input("number"); // Inputs "number" to user_input
		String food = user_input("type of food"); // Inputs "type of food" to user_input
		
		// Prints the first phrase with name and time in it
		System.out.println("Hello, my name is " + name + ". I wake up at " + time + " am and brush my teeth");
		// Prints the second phrase with minutes and food in it
		System.out.println("for " + minutes + " minutes. I then eat " + food + " and leave for school.");

	}

}
