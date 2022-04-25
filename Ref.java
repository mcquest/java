public class Ref
{
	public static void main(String[] args)
	{
		Manager mVariabkesCanBEANyName = new Manager();
		// Accessing a function with Dot notation 
		mVariabkesCanBEANyName.HelloWorld();
		
		java.util.concurrent.TimeUnit.SECONDS.sleep(1);
		
		int[] ia = {5,2,6,7,4,9,0};
		//System.out.println(arrayMax(ia));
		boolean b = false;
		System.out.println(SecondLargest(ia));
		
		/*
		 * How Scanners function in Loops
		 */
		Scanner scan = new Scanner(System.in);
		
	}
	
	// Matrix example
	char[][] m = {{'-','x','o'},
		      {'o','x','-'},
		      {'o','x','-'}};
	
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
			
			for (int i: a)
			{
				//System.out.println(i);
				if (i > l1)
				{
					l2 = l1;
					l1 = i;
					
				}
				else if(i > l2)
				{
					l2 = a[i];
				}
			}
			
			return l2;
		}
		
	}
	
	
	public static void mergeSort(int[] a, int n) 
	{
		if (n < 2)
		{
			return;
		}
		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];
	
		for (int i = 0; i < mid; i++) 
		{
			l[i] = a[i];
		}
		for (int i = mid; i < n; i++) 
		{
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
}
