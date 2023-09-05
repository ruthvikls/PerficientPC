package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementsFromTwoLists {
	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));

		List<Integer> common = new ArrayList<>(list1);
		common.retainAll(list2);

		// list1.retainAll(list2);
		System.out.println(common);
	}
}
