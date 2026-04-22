package code;

import java.util.*;

public class Max_length_String {

	public static void main(String[] args) {
		List<String> list = List.of("Java","Python","Hibernate","Ruby","Spring");
		
		Optional<String> maxS = list.stream()
			.reduce((x,y) -> x.length()>y.length()?x:y);
		
		System.err.println(maxS.get());   //  Hibernate

	}
}
