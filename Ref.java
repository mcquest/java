public class Ref
{
	public static void main(String[] args)
	{
		Manager mVariabkesCanBEANyName = new Manager();
		// Accessing a function with Dot notation 
		mVariabkesCanBEANyName.HelloWorld();
		
		
		
		int[] i = {5,2,6,7,4,9,0};
		System.out.print(arrayMax(i));
	}
	
	
	
	
	
	// Maximum integer from an array 
	// and change comparison for Min
	static int arrayMax(int[] arrayI)
	{
		// Temp variable to store smallest value
		int tempMax = arrayI[0];
		// For loop 
		for (int i =1; i < arrayI.length; i++)
		{
			if (arrayI[i] > tempMax)
			{
				// What is missing here????????????
				tempMax = arrayI[i];
			}
		}
		
		// Return Max
		return(tempMax);
				
	}
}