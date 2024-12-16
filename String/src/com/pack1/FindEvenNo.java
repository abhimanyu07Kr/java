package com.pack1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNo {
	
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(6,8,4,5,2,9,1);
		List<Integer> l2 = l1.stream().filter(n->n%2==0).collect(Collectors.toList());
		Collections.sort(l2);
		System.out.println(l2);
	}

}
