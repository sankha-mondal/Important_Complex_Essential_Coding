package code;

import java.util.*;

public class Palindrom_Words {

	public static void main(String[] args) {
		List<String> list = List.of("mom","madam","son","father","bob","sabbas");
		
		list.stream()
			.filter(word -> word.equals(new StringBuffer(word).reverse().toString()))
			.forEach(word -> System.err.print(word + " "));     //  mom madam bob sabbas 

	}
}
