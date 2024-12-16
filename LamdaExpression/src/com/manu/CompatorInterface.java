package com.manu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class CompatorInterface {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(3);
		al.add(6);
		al.add(1);
		al.add(8);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("sanju");
		al2.add("ziya");
		al2.add("abhi");
		al2.add("rohit");
		al2.add("ram");
		
		
		Comparator<String> c2=(s1,s2)->
				{
					if(s1.length()>s2.length()) return 1;
					else if(s1.length()<s2.length()) return -1;
					else return 0;
				};
				
		
		Comparator<Integer> c=(o1,o2)->
				{
					if(o1>o2) return -1;
					else if(o1<o2) return 1;
					else return 0;
				};
				
		Comparator<String> c3=(obj1,obj2)->
		{
			if(obj1.hashCode()>obj2.hashCode()) return 1;
			else if(obj1.hashCode()<obj2.hashCode()) return -1;
			else return 0;
		};
		
		
		Collections.sort(al2,c3);
//		Collections.sort(al2);
		Collections.sort(al,c);
		System.out.println(al);
		System.out.println(al2);
	}

}
