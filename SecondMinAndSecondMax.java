package ashokit.ArrayLogical;
/*
 * 7)Write Java Program to find second Min and Second Max elements in given Array ?
 */

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondMinAndSecondMax {

	public static void main(String[] args) {
		Integer arr[]= {5,5,5,6,22,10,3,6,6,0,1,33};	
		//Remove duplicates
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
		List<Integer> list = map.keySet().stream().sorted((i1,i2)->i2-i1).collect(Collectors.toList());
		System.out.println("Second Max: "+list.get(1));
		System.out.println("Second Min: "+list.get(list.size()-2));

	}

}
