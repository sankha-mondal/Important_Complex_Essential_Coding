package code;

import java.util.*;

public class Find_First_Largest {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,3,5,9,7,3,6,5,9,4);
		
		Optional<Integer> top = list.stream()
									.distinct()
									.sorted(Collections.reverseOrder())
									.findFirst();
		System.err.println(top.get());    //  9
	}
}
