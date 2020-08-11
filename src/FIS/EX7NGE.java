package FIS;


public class EX7NGE 
{
	 static void printNGE(int arr[], int n) 
	    { 
	        int next, i, j; 
	        for (i=0; i<n; i++) 
	        { 
	            next = -1; 
	            for (j = i+1; j<n; j++) 
	            { 
	                if (arr[i] < arr[j]) 
	                { 
	                    next = arr[j]; 
	                    break; 
	                } 
	            } 
	            System.out.println(arr[i]+" -- "+next); 
	        } 
	    } 
	public static void main(String[] args)
	{
		 int arr1[]= {4,5,2,25}; 
	        int n1 = arr1.length; 
	        System.out.println("Len1 : "+n1);
	        printNGE(arr1, n1); 
	        
		System.out.println("************");
	        
        int arr2[]= {13,7,6,12}; 
        int n2 = arr2.length; 
        printNGE(arr2, n2); 
	}
}
