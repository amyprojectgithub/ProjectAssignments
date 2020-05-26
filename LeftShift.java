package ashokit.ArrayLogical_2;

/*
 *  1) Given an array of N elements and the task is to print the elements of an array after
 *        left rotating array elements by p positions.
 */

public class LeftShift {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=2;
		System.out.print("Given Array:: ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			int start,j;
			start=arr[0];
			for(j=0;j<arr.length-1;j++) {
				//shift element to left one by one
				arr[j]=arr[j+1];
			}
			arr[j]=start;
		}
		//print the array
	    System.out.print("After Left shifting array:: ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
