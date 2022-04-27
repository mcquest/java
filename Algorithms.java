public class Algorithms
{
    public static void main(String[] args) throws Exception 
    {

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


	public static void insertionSortImperativeA(int[] input) 
	{
		for (int i = 1; i < input.length; i++) 
		{ 
			int key = input[i]; 
			int j = i - 1;
			while (j >= 0 && input[j] > key) 
			{
				input[j + 1] = input[j];
				j = j - 1;
			}
			input[j + 1] = key; 
		}
	}

	// First Recursive Call With i as length
	private static void insertionSortRecursiveA(int[] input, int i)
	{
		if (i <= 1) {
			return;
		}
		insertionSortRecursiveA(input, i - 1);
		int key = input[i - 1];
		int j = i - 2;
		while (j >= 0 && input[j] > key) {
			input[j + 1] = input[j];
			j = j - 1;
		}
		input[j + 1] = key;
	}


	public static void selectionSortAscending(int[] arr) 
	{
		for (int i = 0; i < arr.length - 1; i++) 
		{
			int minElementIndex = i;
			for (int j = i + 1; j < arr.length; j++) 
			{
				if (arr[minElementIndex] > arr[j]) 
				{
					minElementIndex = j;
				}
			}
	
			if (minElementIndex != i) 
			{
				int temp = arr[i];
				arr[i] = arr[minElementIndex];
				arr[minElementIndex] = temp;
			}
		}
	}


	public static void mergeSort(int[] a, int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];
	
		for (int i = 0; i < mid; i++) {
			l[i] = a[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = a[i];
		}
		mergeSort(l, mid);
		mergeSort(r, n - mid);
	
		merge(a, l, r, mid, n - mid);
	}


	public static void merge(int[] a, int[] l, int[] r, int left, int right) 
	{
 
    	int i = 0, j = 0, k = 0;
    	while (i < left && j < right) 
		{
        	if (l[i] <= r[j]) 
			{
            	a[k++] = l[i++];
        	}
        	else 
			{
            	a[k++] = r[j++];
        	}
    	}
    	while (i < left) 
		{
        	a[k++] = l[i++];
    	}
    	while (j < right) 
		{
        	a[k++] = r[j++];
    	}
	}


	public static void quickPivotSort(int[] arr, int begin, int end)
	{
		if (begin < end)
		{
			int partitionIndex = pivotHelper(arr, begin, end);

			quickPivotSort(arr, begin, partitionIndex-1);
			quickPivotSort(arr, partitionIndex+1, end);
		}
	}

	public static int pivotHelper(int[] arr, int begin, int end)
	{
		int pivot = arr[end];
		int i = (begin-1);

		for (int j = begin; j < end; j++)
		{
			if (arr[j] <= pivot)
			{
				i++;

				int swapTemp = arr[i];
				arr[i] = arr[j];
				arr[j] = swapTemp;
			}
		}

		int swapTemp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = swapTemp;

		return i+1;
	}


}
