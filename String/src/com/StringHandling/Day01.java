package com.StringHandling;

public class Day01 {
	
	public void reverseString(String s)
	{
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1+=s.charAt(i);
		}
		System.out.println(s1);
	}
	
	
	public static boolean isPallindrome(String s)
	{
		int i=0;
		int j=s.length()-1;
		
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j)) return false;
			
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		Day01 d1 = new Day01();
		d1.reverseString("hello");
		
		System.out.println(isPallindrome("malAyalam"));
	}

}
