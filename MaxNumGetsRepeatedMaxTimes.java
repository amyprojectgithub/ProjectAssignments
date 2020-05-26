package ashokit.ArrayLogical;

/*
 * In a given array find the max value which gets repeated for the max number of times..If 
 * two values get repeated for max number of times,then print the largest one..
 */

public class MaxNumGetsRepeatedMaxTimes {

	public static void main(String[] args) {
		int globalRepeation=0;
		int max=0;
		int arr[]= {1,2,2,2,3,4,7,1,9,0,1,4,4};
		for(int i=0;i<arr.length;i++) {
			int locRepeatation=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j])
					locRepeatation++;
			}
			if(locRepeatation>globalRepeation) {
				max=arr[i];
				globalRepeation=locRepeatation;
			}else if(locRepeatation==globalRepeation) {
				if(max<arr[i])
					max=arr[i];
			}
		}
		System.out.println(max);
	}

}
