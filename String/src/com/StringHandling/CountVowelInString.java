package com.StringHandling;

public class CountVowelInString {
	
	public static void meth1(String s)
	{
		int count=0;
		String s1="aeiouAEIOU";
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(s.charAt(i)==s1.charAt(j))
					count++;
			}
		}
		System.out.println(count);
	}
	
	public static void meth2(String s)
	{
		String s1="";
		String s2="";
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)!=' ')
				{
				s1=s.substring(i,i+1);
				System.out.print(s1);
				}
		}
		
		
		
		
				
	}
	
	public static void main(String[] args) {
		meth2("abhimanyu kumar");
	}

}
