package ashokit.ArrayLogical;

import java.util.Arrays;

/*
 * 6)Write a Java Program to find Min and Max elements in given Array?
 */

public class MinAndMax {
	public static void main(String[] args) {
		Integer arr[]= {5,5,5,4,5,7,7,18,10,100,60};
		//sort the array
		Arrays.sort(arr);		
		System.out.println(" MIN AND MAX ELEMENTS ARE "+arr[0]+" & "+arr[arr.length-1]+" respectively.");
	}

}
