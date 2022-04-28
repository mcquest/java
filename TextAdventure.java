/* 
 * TextAdventure.java
 * MCQuest
 * Teach the user a bit about 
 * Language Learning & Computer Science
 */ 


// Import the Scanner script/class
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

// Classes "ARE" and Functions "DO"
public class TextAdventure
{
	public static void main(String[] args) throws InterruptedException
	{
		String name = user_input("name"); // Inputs "name" to user_input
		String time = user_input("certain time"); // Inputs "certain time" to user_input
		String minutes = user_input("number"); // Inputs "number" to user_input
		String food = user_input("type of food"); // Inputs "type of food" to user_input
		
		// Prints the first phrase with name and time in it
		System.out.println("Hello, my name is " + name + ". I wake up at " + time + " am and brush my teeth");
		// Prints the second phrase with minutes and food in it
		System.out.println("for " + minutes + " minutes. I then eat " + food + " and leave for school.");
		
		// Function call
		StreetChoice1();    
	}
	
	// Ask for user input from text and return the answer
	public static String UserInput (String text)
	{
		// Create a Scanner object
		Scanner myObj = new Scanner(System.in);
		// Prints the input phrase
		System.out.print("Enter a " + text + ": "); 
		// Read user input and sets it to output
		String output = myObj.nextLine();
		// outputs output
		return output; 
	}
	
	
	
	// Mr Charles' Text Adventure Introduction
	// You begin on the street and have two choices
	public static void StreetChoice1() throws InterruptedException
	{
		// Create a Scanner object
	    Scanner scanning = new Scanner(System.in); 
	    
	    // Print a string to the console and go to the next line 
	    System.out.println("Yes or No");
	    
	    String yorn = scanning.next();
	    
	    System.out.println(true);   
	    
	    // Print a string to the console and go to the next line 
	    System.out.println("Who are you?");
	    
	    // Read user input
	    String userName = scanning.nextLine();
	    
	    // Time Delay 
		//try 
		//{
		TimeUnit.SECONDS.sleep(5);
		//} 
		//catch (InterruptedException e) 
		//{
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
	    
	    // Output user input
	    System.out.println("Username is: " + userName);  
	    
	    // If statement to check string input
	    if (userName.equals("MathWizard") | userName.equals("Naruto"))
	    {
	    	System.out.println("You have unlocked the secret tower.");
	    }
	    else
	    {
	    	System.out.println("Left or Right?");
	    	String direction = scanning.nextLine();
	    	System.out.println("You have chosen: " + direction);
	    }
	    System.out.println("true or false?");
	    
	    Boolean yesorno = scanning.nextBoolean();
	    
	    System.out.println(yesorno);
	}
	
	static void StreetChoice2 ()
	{
		
	}
	
	static void Building1 ()
	{
		
	}

}
