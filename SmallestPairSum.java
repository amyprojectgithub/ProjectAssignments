package ashokit.ArrayLogical;
/*
 * 10)Write a Java Program to find smallest pair sum in given Array?
 */

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SmallestPairSum {

	public static void main(String[] args) {
		Integer arr[]= {5,5,5,3,4,5,7,7,8,1};
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
		List<Integer> list = map.keySet().stream().sorted().collect(Collectors.toList());
		System.out.println("Smallest pair sum: "+(list.get(0)+list.get(1)));

	}

}
