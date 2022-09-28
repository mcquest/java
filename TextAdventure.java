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
	// Create a Scanner object
	static Scanner scanningObject = new Scanner(System.in);

	public static void main(String[] args) 
	{
		
		Choice1();    
	}
	
	// Ask for user input from text and return the answer
	public static String UserInput (String text)
	{
		// Prints the input phrase
		System.out.print("Enter a " + text + ": "); 
		// Read user input and sets it to output
		String output = scanningObject.nextLine();
		//scanningObject.close();
		return output; 
	}
	
	// Function to prompt left or right input choice from user
	public static String LorR (String text)
	{
		return text;
	}
	
	
	
	// Mr Charles' Text Adventure Introduction
	// You begin on the street and have two choices
	public static void Choice1() 
	{
		// Create a Scanner object
	    //Scanner scanning = new Scanner(System.in); 
	    
	    // Print a string to the console and go to the next line 
	    System.out.println("Yes or No");
	    
	    String yesorno = scanningObject.nextLine();
	    
	    System.out.println(yesorno);   
	    
	    // Print a string to the console and go to the next line 
	    System.out.println("Who are you?");
	    
	    // Read user input
	    String userName = scanningObject.nextLine();
	    
	    // Time Delay 
		//try 
		//{
		//TimeUnit.SECONDS.sleep(5);
		//} 
		//catch (InterruptedException e) 
		//{
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
	    System.out.println("To be continued");
	      
	    /* 
	    // If statement to check string input
	    if (userName.equals("MathWizard") || userName.equals("Naruto"))
	    {
			// Output user input
			System.out.println("Username is: " + userName);
	    	System.out.println("You have unlocked the secret tower.");
	    }
		 
	    else
	    {
			// Output user input
			System.out.println("Username is: " + userName);
	    	System.out.println("Left or Right?");
	    	String direction = scanning.nextLine();
	    	System.out.println("You have chosen: " + direction);
	    }
		*/
	    //System.out.println("true or false?");
	    
	    //Boolean b1 = scanning.nextBoolean();
	    
	    //System.out.println(b1);

		String name = UserInput("name");
		String time = UserInput("time"); 
		String minutes = UserInput("number"); 
		String food = UserInput("type of food"); 
		
		// Prints the first phrase with name and time in it
		System.out.println("Hello, my name is " + name + ". I wake up at " + time + " am and brush my teeth");
		// Prints the second phrase with minutes and food in it
		System.out.println("for " + minutes + " minutes. I then eat " + food + " and leave for school.");
		
		// Function call
	}
	
	static void StreetChoice1 ()
	{
		
	}
	
	static void Building1 ()
	{
		
	}

}
