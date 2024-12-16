package com.manu.Stream;

import java.util.Arrays;
import java.util.List;

class Emp{
	String name;
	int age;
	public Emp(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
public class Demo1 {

	public static void main(String[] args) {
		List<Emp> l = Arrays.asList(new Emp("abhi", 21),
				new Emp("sumit", 28),
				new Emp("goutam", 12),
				new Emp("summi", 14)
				);
		
		l.stream().filter(n->n.age>18)
		.map(n->n.name.substring(0, 1).toUpperCase()+n.name.substring(1, n.name.length()))
		.forEach(n->System.out.println(n));
	}
}
