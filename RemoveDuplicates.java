package ashokit.ArrayLogical;

import java.util.LinkedHashMap;
import java.util.Map;
/*
 * 2)Write a Java Program to remove duplicate elements in given Array?
 */
public class RemoveDuplicates {

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
		
		System.out.println(map.keySet());

	}

}
