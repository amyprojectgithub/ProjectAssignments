package ashokit.ArrayLogical;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * 4)Write a Java program to find third largest number in given Array ?
 */
@SuppressWarnings("resource")
public class FindingKthLargestNumber {

	public static void main(String[] args) {
		System.out.println("::Findng Kth Largest Number:::");
		Scanner sc=new Scanner(System.in);
		Integer arr[]= {5,5,5,6,22,10,3,6,6};	
		System.out.println("Enter value of k");
		int k=sc.nextInt();
		if(k>arr.length) {
			System.out.println("Invalid input...Array size is "+arr.length);
			return;
		}

		//remove duplicates logic
		Map<Integer, Integer> map=new LinkedHashMap<Integer, Integer>();
		for(Integer key:arr) {
			Integer count=map.get(key);
			if(count==null) {
				map.put(key, 1);
			}else {
				count++;
				map.put(key, count);
			}
		}
	    List<Integer> list = map.keySet().stream().sorted((i1,i2)->i2-i1).collect(Collectors.toList());
	    	System.out.println(list.get(k-1));
	
	}


	

}
