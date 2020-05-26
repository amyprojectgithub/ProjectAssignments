package ashokit.ArrayLogical;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 * 1)Write a Java Program to find duplicate elements in given Array?
 */

public class FindDuplicate {

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
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()>1)
				System.out.print(entry.getKey()+"  ");
		}
		
		//There is loopholes taking forloop and set collection
		/*Set< Integer> set=new HashSet<Integer>();
		for(Integer key:arr) {
			if(!set.add(key)) {
				System.out.println(key);
			}
		}*/

	}

}
