package ashokit.ArrayLogical_2;

import java.util.Arrays;

/*
 *  8) You have been given an array of positive integers A1,A2,...,An 
 *  with length N and you have to print an array of same length(N)
 *  where the values in the new array are the sum of every number in the array, 
 *  except the number at that index.
 */


public class SumArray {

	public static void main(String[] args) {
		int arr[]= {4, 5, 6};
		int length=arr.length;
		int tempArr[]=new int[length];
		System.out.println("Given Array:: "+Arrays.toString(arr));
        for(int i=0;i<length;i++) {
        	int sum=0;
        	for(int j=0;j<length;j++) {
        		sum=sum+arr[j];
        	}
        	tempArr[i]=sum-arr[i];
        }
       System.out.println( "Output:: "+Arrays.toString(tempArr));
	}

}
