package code;

import java.util.*;

public class Descending_order {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(2,5,1,4,3,9,7);
		
		list.stream()
			.sorted(Collections.reverseOrder())
			.forEach(System.out::print);   //  9 7 5 4 3 2 1

	}

}
