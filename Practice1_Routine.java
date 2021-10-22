// Imports Scanner
import java.util.Scanner;

// Makes the class
public class Practice1_Routine 
{
	
	// Creates a public static function called user_input with a return type of String
	public static String user_input(String var1) 
	{
		// Create a Scanner object
		Scanner myObj = new Scanner(System.in);
		// Prints the input phrase
	    System.out.print("Enter " + var1 + ": "); 
	    // Read user input and sets it to output
	    String output = myObj.nextLine();
	    // outputs output
		return output; 
	}
	
	// The main function
	public static void main(String[] args) 
	{
		// Inputs "name" to user_input
		String name = user_input("name");
		// Inputs "certain time" to user_input
		String time = user_input("certain time");
		// Inputs "number" to user_input
		String minutes = user_input("number");
		// Inputs "type of food" to user_input
		String food = user_input("type of food"); 
		
		// Prints the first phrase with name and time in it
		System.out.println("Hello, my name is " + name + ". I wake up at " + time + " am and brush my teeth");
		// Prints the second phrase with minutes and food in it
		System.out.println("for " + minutes + " minutes. I then eat " + food + " and leave for school.");

	}

}