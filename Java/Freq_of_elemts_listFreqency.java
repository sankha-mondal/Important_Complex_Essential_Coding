package codes;

import java.util.*;

public class Freq_of_elemts_listFreqency {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,2,4,1,3);
		
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		for (int x:list) {
			map.put(x,  Collections.frequency(list, x));
		}
		
		System.err.println(map);  //   {1=2, 2=2, 3=2, 4=1}
	}
}
