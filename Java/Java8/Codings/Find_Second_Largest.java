package code;

import java.util.*;

public class Find_Second_Largest {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,3,5,9,7,3,6,5,9,4);
		
		Optional<Integer> sec = list.stream()
			.distinct()
			.sorted(Collections.reverseOrder())
			.skip(1)
			.findFirst();
		
		System.err.println(sec.get());  //  7
	}
}
