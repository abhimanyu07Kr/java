package com.manu.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,0,2,23,56,1,3,4,5,6,7,8,9,10);
		Stream<Integer> s = l.stream();
		List<Integer> list = s.filter(n->n%2==0).map(n->n*n).sorted().collect(Collectors.toList());
		System.out.println(list);
		
		

	}

}
