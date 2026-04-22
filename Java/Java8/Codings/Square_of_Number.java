package code;

import java.util.*;

public class Square_of_Number {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,3,4,5,6);
		
		list.stream()
			.map(n -> n*n)
			.forEach(System.out::print);  //  1 4 9 16 25 36
	}
}
