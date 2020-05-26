package ashokit.ArrayLogical_2;

/*
 *  5) Write a Java program to find the Leader element from an given array of integers. 
 *  Leader element: A Leader element is an element that appears more than n/2 times where n is the size of the array.
 *  if more than one leader element is presented then print highest number from those.
 *  If no Leader element present in the given array then print "Leader Element Doesn't Exist".
 */

public class FindLeaderElement {

	public static void main(String[] args) {
		int arr[]= {1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2,6,6,6};
		int size=arr.length;
		int leaderSize=size/2;
		int globalLeader=0;
		boolean flag=false;
		System.out.print("Given Array:: ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<size;i++) {
			int localCount=0;
			for(int j=0;j<size;j++) {
				if(arr[i]==arr[j]) {
					localCount++;
				}
				if(localCount>=leaderSize) {
					flag=true;
					if(arr[i]>globalLeader) 
						globalLeader=arr[i];
				}//if
			}//for-2
		}//for-1
		if(!flag)
		 System.out.println("Leader Element Doesn't Exist");
		else
		 System.out.print("Leader Element is:: "+globalLeader);
	}//main()
}//class


