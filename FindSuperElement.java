package ashokit.ArrayLogical_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 *  6) Write a java program to find super elements in given integer array.
 *   If no super element is presented then print output as "No Super Elements".
 *   Super Element : The element which contains at least two greater elements is called Super Element.
 */

public class FindSuperElement {

	public static void main(String[] args) {
		int arr[]= {9,2,1,3,4,5,6,7};
		int size=arr.length;
		List< Integer> list=new ArrayList<Integer>();
		boolean flag=false;
		System.out.print("Given Array:: ");
		/*for(int i:arr) {
			System.out.print(i+" ");
		}*/
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<size;i++) {
			int count=0;
			for(int j=0;j<size;j++) {
				if(arr[i]<arr[j]) 
					count++;
			}
			if(count>=2) {
				flag=true;
				list.add(arr[i]);
			}
		}
	    if(flag) {
	    	Collections.sort(list);
	    	System.out.print("Super Elements:: "+list);    	
	    }else {
	    	System.out.println("Super Element Doesn't exist");
	    }
	}

}
