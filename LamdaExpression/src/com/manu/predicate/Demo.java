package com.manu.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Predicate<Integer> p=n->n%2==0;
		for(int i=0;i<l.size();i++)
		{
			if(p.test(l.get(i))) System.out.println(l.get(i));
		}
		
		
		System.out.println("===============================");
		Function<Integer, Integer> f=n->n*n;
		
		for(int i=0;i<l.size();i++)
			System.out.println(f.apply(l.get(i)));
		
		System.out.println("==========================");
		
		Consumer<Integer> c=n->System.out.println(n);
		
		for(int i=0;i<l.size();i++)
			c.accept(l.get(i));
			
	}

}
