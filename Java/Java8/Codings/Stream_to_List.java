package code;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_to_List {

	public static void main(String[] args) {
		
		Stream<Integer> slist = Stream.of(1,2,3,4,5);
		
		List<Integer> list = slist.collect(Collectors.toList());
		
		System.err.println(list);   //  [1, 2, 3, 4, 5]

	}
}
