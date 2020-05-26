package ashokit.ArrayLogical_2;

/*
 * 2) Given an array of N elements and the task is to print the elements of an array
 *      after right rotating array elements by p positions.
 */

public class RightShift {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=2;
		System.out.print("Given Array:: ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
       for(int i=0;i<n;i++) {
    	   int last,j;
    	   last=arr[arr.length-1];
    	   for(j=arr.length-2;j>=0;j--) {
    		   //shift element to the right one by one
    		     arr[j+1]=arr[j];
    	   }
    	   arr[0]=last;
       }
       System.out.print("After Right shifting array:: ");
       for(int i:arr) {
    	   System.out.print(i+" ");
    	   
       }

	}//main()

}//class
