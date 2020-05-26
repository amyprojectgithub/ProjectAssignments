package ashokit.ArrayLogical;
/*
 * 9)Write a Java program to find element Pairs in given Array whose sum is equal to given number
 */

public class FindElementPair {

	public static void main(String[] args) {
		int arr[]= {3, 6,5, 8, -8, 10, 8,11 } ;
		int pairSum=16;
		System.out.println("Pairs are::");
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]+arr[j])==pairSum) {
					System.out.println("                 ("+arr[i]+", "+arr[j]+")");
				} 
			}
		}

	}

}
 