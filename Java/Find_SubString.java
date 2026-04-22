package codes;

import java.util.*;

public class Find_SubString {

	public static void main(String[] args) {
		String str = "BABC";
        Set<String> sub_list = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                sub_list.add(str.substring(i, j));
            }
        }

        System.out.println(sub_list);
        //  [A, AB, BC, B, ABC, BAB, C, BABC, BA]

	}

}
