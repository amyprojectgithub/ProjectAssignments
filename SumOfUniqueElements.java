package ashokit.ArrayLogical;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * 3)Write a Java Program to find sum of unique elements in given Array?
 */

public class SumOfUniqueElements {

	public static void main(String[] args) {
		Integer arr[]= {5,5,5,3,4,5,7,7,8,0,1,0};
		Map<Integer, Integer> map=new LinkedHashMap<Integer, Integer>();
		for(Integer key:arr) {
			Integer val=map.get(key);
			if(val==null) {
				map.put(key, 1);
			}else {
				val++;
				map.put(key, val);
			}
		}
		Integer sum=0;
	   for(Integer num:map.keySet()) {
		   sum=sum+num;
	   }
	   System.out.println("Unique elements in the given array are: "+map.keySet());
	   System.out.println("Sum of unique elements: "+sum);

	}

}
