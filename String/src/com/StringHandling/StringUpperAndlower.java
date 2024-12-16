package com.StringHandling;

public class StringUpperAndlower {
	
	public static String lowerAndUpper(String s)
	{
		
		
		int upr=0;
		int low=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z') low++;
			else upr++;
		}
		System.out.println("lower"+low+"\tupper "+upr);
		if(upr>low) return s.toUpperCase();
		
		 return s.toLowerCase();
	}
	public static void main(String[] args) {
		String string = lowerAndUpper("Hellow");
		System.out.println(string);
	}

}
