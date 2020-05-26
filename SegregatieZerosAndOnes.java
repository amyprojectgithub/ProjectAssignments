package ashokit.ArrayLogical_2;

/*
 * 3) You are given an array of 0s and 1s in random order.
 *  Segregate 0s on left side and 1s on right side of the array. 
 *  Traverse array only once.
 */

public class SegregatieZerosAndOnes {

	public static void main(String[] args) {
		int arr[]= {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		int length=arr.length;
		int segArr[]=new int[length];
		int zerosCount=0;
		int onesCount=0;
		System.out.print("Given Array:: ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("Segregated Array:: ");
		for(int i=0;i<length;i++) {
			if(arr[i]==0)
				zerosCount++;
			else
				onesCount++;
		}
		for(int i=0;i<arr.length;i++) {
			if(i<zerosCount) 
				arr[i]=0;
			else
				arr[i]=1;
		}

		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
