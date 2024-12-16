package com.pack1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Emp{
	int id;
	String name;
	int sal;
	public Emp(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
}

class CompareEmp implements Comparator<Emp>
{

	@Override
	public int compare(Emp o1, Emp o2) {
		if(o1.sal>o2.sal) return 1;
		else if(o1.sal<o2.sal) return -1;
		else return 0;
	}
	
}
public class DriverEmp {
	public static void main(String[] args) {
		List<Emp> l1 = Arrays.asList(new Emp(101,"abhi", 1000),new Emp(102, "manu", 2000),new Emp(103, "sumit", 500));
		Collections.sort(l1, new CompareEmp());
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
	}

}
