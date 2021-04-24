import java.io.*;
import java.util.*;


public class test {
   
	public static int minimumDiff(int arr[], int n, int j) {
		int result = Integer.MAX_VALUE;
		Arrays.sort(arr);
		for (int i=0; i<= n-j;i++)
			result = Math.min(result, arr[i + j - 1] - arr[i]);
		return result;
		
	}
	public static int find(int res,int arr[], int n, int j)
	{
		int result = Integer.MAX_VALUE;
		for(int i=0; i<=n; i++)
		{
			result = Math.min(result, arr[i + j - 1] - arr[i]);
			if (res==result)
				return i;
					
		}
		return 0;
	}
	public static void main(String[] args) throws IOException  {
	    
	   
	    String items[]={ "MI Band: 999","Sandwich Toaster: 2195" ,"Cult Pass: 2799","Scale: 4999","Fitbit Plus: 7980","Microwave Oven: 9800"  ,"Alexa: 9999","Digital Camera: 11101", "IPods: 22349","Macbook Pro: 229900" };  //storing the details about the goodies and price in item
                     

                       int array[]={999,2195,2799,4999,7980,9800,9999,11101,22349,229900}; 
	    int n = array.length;
	    System.out.println("Enter the number of employees"); // number of employees
	    Scanner s = new Scanner(System.in); 
	    int k=s.nextInt();
	    int result=minimumDiff(array, n, k);  //selecting the minimum diiference
	    System.out.println("Number of the employees:"+k); 
	    int startindex=find(result,array,n,k);
	    System.out.println("Here the goodies that are selected for distribution are:");
	    for(int i=startindex;i<startindex+k;i++)
	    System.out.println(items[i]);
	      System.out.println("And the difference between the chosen goodie with highest price and the lowest price is:"+result);
	} 
	
		
	}