package com.manu.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {
	public static void main(String[] args) {
		String s="java is a programming langauge";
		String[] arr = s.split(" ");
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0;i<arr.length;i++)
		{
			list.add(arr[i]);
		}
		List<String> list2 = list.stream().map(n->n.substring(0, 1).toUpperCase()+n.substring(1, n.length()).toLowerCase()).collect(Collectors.toList());
		
		String s1="";
		for(int i=0;i<list2.size();i++)
			s1+=list2.get(i)+" ";
		
		System.out.println(s1);
		
		
	}

}
