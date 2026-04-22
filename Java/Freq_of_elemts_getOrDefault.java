package codes;

import java.util.*;

public class Freq_of_elemts_getOrDefault {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 4};

        Map<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        System.out.println(map);   //  {1=2, 2=1, 3=1, 4=1}

	}

}
