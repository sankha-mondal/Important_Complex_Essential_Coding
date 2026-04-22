package code;

import java.util.*;

public class Upper_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = List.of("Java","Python","Ruby","Spring");
		
		list.stream()
			.map(str -> str.toUpperCase()+" ")
			.forEach(System.out::print);  //  JAVA PYTHON RUBY SPRING 
	} 
}
