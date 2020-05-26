package ashokit.ArrayLogical;

import java.util.Arrays;

/*
 * 5)Write a java program to find maximum difference between two elements in given Array?
 */

public class MaxDiff {

	public static void main(String[] args) {
		Integer arr[]= {5,5,5,4,5,7,7,18,10,100,60};
		//sort the array
		Arrays.sort(arr);		
		System.out.println(" MAXIMUM DIFFERENCE BETWEEN TWO ELEMENTS IN THE GIVEN ARRAY IS: ");
		System.out.println(arr[arr.length-1]-arr[0]);

	}

}
