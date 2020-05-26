package ashokit.ArrayLogical;
import java.util.HashSet;
/*
 * 8)Write a Java Program to find common elements among below 3 Arrays?
 */
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CommonElementsIn3Arrays {

	public static void main(String[] args) {
		int arr1[]= {2,4,5,1,6,12,5,4,2};
		int arr2[]= {1,3,6,1,0,5,9};
		int arr3[]= {11,7,1,6,8,5,24};
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				for(int k=0;k<arr3.length;k++) {
					if(arr1[i]==arr2[j] && arr2[j]==arr3[k]) {
						//to restrict duplicate to print
					          set.add(arr3[k]);
					          break;
					}
				}
			}
		}
		System.out.println(set);

	}

}
