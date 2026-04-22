package code;

import java.util.*;

public class Sum_of_Numbers {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5,6);
		
		Optional<Integer> sum = list.stream()
			                        .reduce((x,y) -> (x+y));
		
		System.err.println(sum.get());   //  21
			
			

	}
}
