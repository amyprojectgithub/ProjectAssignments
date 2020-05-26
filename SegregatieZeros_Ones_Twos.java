package ashokit.ArrayLogical_2;

/*
 *  4) You are given an array of 0s,  1s and 2s in random order. Segregate 0s, 1s and 2s in the array.
 */

public class SegregatieZeros_Ones_Twos {

	public static void main(String[] args) {
		int arr[]= {0, 1, 0, 2, 0,1, 0, 2, 1, 2, 0,1,1};
		int length=arr.length;
		int segArr[]=new int[length];
		int zerosCount=0;
		int onesCount=0;
		int twosCount=0;
		System.out.print("Given Array:: ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("Segregated Array:: ");
		for(int i=0;i<length;i++) {
			if(arr[i]==0)
				zerosCount++;
			else if(arr[i]==1)
				onesCount++;
			else
				twosCount++;
		}
		for(int i=0;i<arr.length;i++) {
			if(i<zerosCount) 
				arr[i]=0;
			else if(i >=zerosCount && i<(onesCount+zerosCount))
				arr[i]=1;
			else
				arr[i]=2;
		}

		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
