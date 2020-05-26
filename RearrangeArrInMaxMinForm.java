package ashokit.ArrayLogical_2;

import java.util.Arrays;

/*
 *  7) Write a Java program to sort an array of positive integers of an given array, 
 *  in the sorted array the value of the first element should be maximum,
 *   second value should be minimum value, third should be second maximum,
 *   fourth second be second minimum and so on.
 */

public class RearrangeArrInMaxMinForm {

	public static void main(String[] args) {
		int arr[]= {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int length=arr.length;
		int tempArr[]=new int[length];
		System.out.println("Given Array:: "+Arrays.toString(arr));
		int min=0,max=length-1;
		boolean flag=true;
		for(int i=0;i<length;i++) {
			if(flag)
				tempArr[i]=arr[max--];
			else
				tempArr[i]=arr[min++];
			flag=!flag;				
		}
		System.out.println("Output:: "+Arrays.toString(tempArr));
	}

}
