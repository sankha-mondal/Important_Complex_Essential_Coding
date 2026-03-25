package codes;

import java.util.*;

public class Store_All_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr  = {2,2,3};
		
		Set<List<Integer>> result = new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			List<Integer> temp = new ArrayList<>();
			
			for(int j=i;j<arr.length;j++) {
				temp.add(arr[j]);
				result.add(new ArrayList<>(temp));
			}
		}
		
		System.err.println(result.size());
		// Op: 5
		System.err.println(result);
		// Op: [[2], [2, 2], [2, 2, 3], [2, 3], [3]]
		
		
	}

}
