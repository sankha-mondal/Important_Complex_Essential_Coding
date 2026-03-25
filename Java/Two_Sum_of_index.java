package codes;

import java.util.*;

public class Two_Sum_of_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,4,9,3};
		int target = 13;
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for (int i=0;i<nums.length;i++) {
			int diff = target - nums[i];
			
			if (map.containsKey(diff)) {
				System.err.println(map.get(diff) +" "+ i);
			}
			map.put(nums[i], i);
		}
		
		
	}
}
