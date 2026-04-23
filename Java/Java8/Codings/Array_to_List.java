package code;

import java.util.*;
import java.util.stream.Collectors;

public class Array_to_List {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		List<Integer> list = Arrays.stream(arr)
				                   .boxed()
				                   .collect(Collectors.toList());
		System.err.println(list);  //  [1, 2, 3, 4, 5, 6]

	}
}
