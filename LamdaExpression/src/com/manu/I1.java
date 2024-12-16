package com.manu;

@FunctionalInterface
interface I2 {
	
	int meth1(int n,int m);
}

public class I1 {
	public static void main(String[] args) {
		
		I2 x=(m,n)->{
			if(m>n) return m;
			else return n;
		};
		int string = x.meth1(10,20);
		System.out.println(string);
	}

	
	
	
	
}
