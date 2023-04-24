/*
 * mcquest algorithms in java
 * array traversal
 * sorting
 */

// To print arrays
import java.util.Arrays;

public class Algorithms
{
	// global variables to call without an instance
	static int [] array1 = {2,1,4};
	static int [] array2 = {12,7,43,114,10,5,2,1,4,3,0,8};

	// global variables to call w/ a created {class} object instance
	int[] a3 = {3,2,7,1,0,4,2};

	
    public static void main(String[] args) throws Exception 
    {
		System.out.println();
		Algorithms A = new Algorithms();
		// testing print statements
		System.out.println("Hello World~");
		System.out.println(Arrays.toString(quickPivotSort(array1, 0, 2)));
		System.out.println(Arrays.toString(insertionSortRecursiveA(A.a3,A.a3.length) ));
		mergeSort(array2, array2.length);
		System.out.println(Arrays.toString(array2));
    }

    static boolean NameCheck(String[] arr)
    {
        String name = "Charles";
        for (int i = 0; i < arr.length; i++ )
        {
            if (arr[i].equals(name))
            {
                return true;
            }
        }
        return false;
    }
	
	
    public static void recurFun2(int n)
    {
        System.out.println(n);
        if(n>2)
        {
	
            recurFun2(n-1);
            System.out.print(n);
        }

    }
	

    // Maximum integer from an array 
	// and change comparison for Min
	static int arrayMax(int[] arrayI)
	{
		// Temp variable to store smallest value
		int max = arrayI[0];
		// For loop 
		for (int i =1; i < arrayI.length; i++)
		{
			if (arrayI[i] > max)
			{
				max = arrayI[i];
			}
		}
		
		// Return Max
		return(max);		
	}


	// second largest int in an array 
	static int SecondLargest(int[] a )
	{
		
		if (a.length == 0 | a.length == 1)
		{
			return -0;
		}
		
		
		else
		{
			int l2; 
			int l1;
			
			if (a[0] > a[1])
			{
				l2 = a[1];
				l1 = a[0];
				
			}
			else
			{
				l2 = a[0];
				l1 = a[1];
			}
			
			for (int n: a)
			{
				//System.out.println(i);
				if (n > l1)
				{
					l2 = l1;
					l1 = n;
					
				}
				else if(n > l2)
				{
					l2 = n;
				}
			}
			
			return l2;
		}	
	}
	

	public static int[] ShiftRight(int[] arrayE)
   	{
        int l = arrayE.length;
        int last = arrayE[l-1];
        for (int i = 1; i <= l-1; i++)
        {
            for (int j = 0; j <= l-2; i++)
            {
                arrayE[i] = arrayE[j];
            }
        }
        arrayE[0] = last;
        return arrayE;
    	}


	// Method to reurn integer array sorted from smallest to largest
	public static int[] insertionSortImperativeA(int[] inputA) 
	{
		// for loop from second element to 1 less than length
		for (int i = 1; i < inputA.length; i++) 
		{ 
			// store the second-end element in the array
			int key = inputA[i]; 
			// variable to store trailing elements indeces
			int j = i - 1;
			//while loop to check leading and trailing elements for value
			while (j >= 0 && inputA[j] > key) 
			{
				//array index accessing to move up large element
				inputA[j + 1] = inputA[j];
				// iterate through trailing values to check against key
				j = j - 1;
			}
			// finish swap if while loop is true else the element stays in place
			inputA[j + 1] = key; 
		}
		return inputA;
	}

	// First Recursive Call With i as length
	private static int[] insertionSortRecursiveA(int[] inputA, int i)
	{
		// check for array of length 1 || recursive core call
		if (i <= 1) 
		{
			// return
			return inputA;
		}
		// recursive call -> acts like a for loop
		insertionSortRecursiveA(inputA, i - 1);
		// store the index 0 element of the array all the way to the index length-1 
		int key = inputA[i - 1];
		// store index for trailing elements to key
		int j = i - 2;
		// move elements larger than key to the right side of it
		while (j >= 0 && inputA[j] > key) 
		{
			// switch greater numbers on right side with lower key
			inputA[j + 1] = inputA[j];
			// decrement key - trailing indexes to 0
			j = j - 1;
		}
		// finish switch if while loop is true else the element stays in place
		inputA[j + 1] = key;
		return inputA;
	}


	// sort array smallest to largest
	public static int[] selectionSortAscending(int[] arr) 
	{
		// for loop to move through array
		for (int i = 0; i < arr.length - 1; i++) 
		{
			// variable to store minimum index
			int minElementIndex = i;
			// check right side of min index
			for (int j = i + 1; j < arr.length; j++) 
			{
				// statement to check if element on the left is larger
				if (arr[minElementIndex] > arr[j]) 
				{
					// statement to move large element index to the right
					minElementIndex = j;
				}
			}
			
			// if there are elements to the left that are smaller than elements to the right
			// swap smaller with larger element
			if (minElementIndex != i) 
			{
				// variable to store element on the left
				int temp = arr[i];
				// statement to move smaller element left
				arr[i] = arr[minElementIndex];
				// move larger element to the right
				arr[minElementIndex] = temp;
			}
		}
		// int[]
		return arr;
	}

	// sort array a smallest to largest with n length
	// does not return a value
	public static void mergeSort(int[] a, int n) 
	{
		// return at length 1 recursive calls 
		if (n < 2) 
		{
			return;
		}
		// midpoint integer (odd = half with decimal chopped off)
		int mid = n / 2;
		// Debugging print statement
		System.out.println(mid);
		// variable array for left half marker
		int[] l = new int[mid];
		// variable array for right half marker (+1 if odd)
		int[] r = new int[n - mid];
		// create left half array, +1 if odd length a using a for loop
		for (int i = 0; i < mid; i++) 
		{
			// move elements from array a to midpoint array
			l[i] = a[i];
		}
		// create right half array
		for (int j = mid; j < n; j++) 
		{
			// move second half of array a to right half length array r
			r[j - mid] = a[j];
		}
		
		// recursive function call with left side
		mergeSort(l, mid);
		// recursive function call with the right side
		mergeSort(r, n - mid);
		// helper function/method to  merge left and right lists
		// larger elements to the right
		merge(a, l, r, mid, n - mid);
	}

	// merge helper function~method to merge elements on left and right array sides-recursions
	public static void merge(int[] a, int[] l, int[] r, int left, int right) 
	{
		// variable to start at beginning left and right l,r 0 - half array index
    	int i = 0, j = 0;
		// variable to move through full length array
		int k = 0;

		// loop through array moving lower half of elements to l  and upper to r
    	while (i < left && j < right) 
		{
			// if  statement to decide which half the element goes on
        	if (l[i] <= r[j]) 
			{
				// l length is 1/2 a
				// place element from one array into another then step +1  with  both iterative variables 
            	a[k++] = l[i++];
        	}
        	else 
			{
				//  r length is 1/2 a or +1 if odd length
            	a[k++] = r[j++];
        	}
    	}

		// loop to place remaining elements if they go on the lower l half
    	while (i < left) 
		{
			// statement to add element to half array and increase iterators
        	a[k++] = l[i++];
    	}
		// looping place remaining elements if in upper half r 
    	while (j < right) 
		{
			// add element to half array and increase iterators
        	a[k++] = r[j++];
    	}
	}

	// Sorting algorithm - method
	public static int[] quickPivotSort(int[] arr, int begin, int end)
	{
		// statement to check beginning and end of list index values
		// is the length of the array greater than 0
		if (begin < end)
		{
			// go to helper function for extended logic to avoid nested if statements
			int partitionIndex = pivotHelper(arr, begin, end);
			// create parallel processes for solving
			quickPivotSort(arr, begin, partitionIndex-1);
			quickPivotSort(arr, partitionIndex+1, end);
		}

		return arr;
	}

	// helper method for organization
	public static int pivotHelper(int[] arr, int begin, int end)
	{
		// end represents the last index of the array
		int pivot = arr[end];
		// used for element swap
		int i = (begin-1);

		// loop through beginning to end index of list
		for (int j = begin; j < end; j++)
		{
			// check if the index value is less than the pivot
			if (arr[j] <= pivot)
			{
				// add to place holder index swapper
				i++;
				// testing print statements
				System.out.println(i);
				System.out.println(j);
				// variable to store swapping value
				int swapTemp = arr[i];
				// swap values 
				arr[i] = arr[j];
				arr[j] = swapTemp;
			}
		}

		// final element swap for each recursive call
		int swapTemp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = swapTemp;
		
		return i+1;
	}


}
