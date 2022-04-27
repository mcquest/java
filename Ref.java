public class Ref
{
	static int[] testA = {2,1,6,5,9,0};
	// Matrix example
	char[][] m = {{'-','x','o'},
		      {'o','x','-'},
		      {'o','x','-'}};
	
	public static void main(String[] args)
	{
		//Holds App
        	//Scanner scanObj = new Scanner(System.in);
        	//String name = scanObj.next();

        	//Manager mVariabkesCanBEANyName = new Manager();
		// Accessing a function with Dot notation 
		//mVariabkesCanBEANyName.HelloWorld();
		
		java.util.concurrent.TimeUnit.SECONDS.sleep(1);
		
		int[] ia = {5,2,6,7,4,9,0};
		//System.out.println(arrayMax(ia));

		// Boolean Variable
		boolean b1 = false;

		// Send to Console
		System.out.println(Algorithms.SecondLargest(ia));


		//Algorithms.insertionSortImperativeA(testA);
		//Algorithms.insertionSortRecursiveA(testA, testA.length);
		//Algorithms.selectionSortAscending(testA);

		//Merge Sort to sort an integer array in ascending order
		//Algorithms.mergeSort(testA, testA.length);

		//QuickSort Ascending Algorithm 
		//Algorithms.quickPivotSort(testA, 0, testA.length-1);

		for (int n: testA)
		{
			System.out.print(n);
		}
		

		/*
		 * How Scanners function in Loops
		 */
		Scanner scan = new Scanner(System.in);
		scan.close();

		
	}
	
	
}
