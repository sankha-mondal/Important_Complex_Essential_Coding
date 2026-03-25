package codes;

import java.util.*;

public class Freq_of_elemts_containsKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,1,4,3};
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();		
		
		for (int x:arr) {
			if (map.containsKey(x)) {
				int c = map.get(x);
				map.put(x, ++c);
			}
			else {
				map.put(x, 1);
			}
		}
		
		System.err.println(map); //  {1=2, 2=1, 3=2, 4=1}
		
		
		
		
		
	}

}
