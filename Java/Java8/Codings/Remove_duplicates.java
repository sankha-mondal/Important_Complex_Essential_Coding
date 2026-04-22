package code;

import java.util.*;

public class Remove_duplicates {

	public static void main(String[] args) {
		
		List<Integer> list =  List.of(1,2,3,4,5,6,7,1,2,3,4,5,6,7);
		
		list.stream()
			.distinct()
			.forEach(System.out::println);  // 1,2,3,4,5,6,7

	}
}
