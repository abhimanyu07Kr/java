package com.StringHandling;

public class FindOnlyDigit {
	
	public static void meth1(String s)
	{
		StringBuilder s1 = new StringBuilder();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
				s1.append(s.charAt(i));
		}
		System.out.println(s1);
	}
	
	public static void sumOfDigitInString(String s)
	{
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int c=s.charAt(i)-'0';
				sum+=c;
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
//		meth1("FJIFGU3FH9HEWuf6suf2");
//		sumOfDigitInString("23dfdgufj5kjdshf9kkshaf6");
	}

}
