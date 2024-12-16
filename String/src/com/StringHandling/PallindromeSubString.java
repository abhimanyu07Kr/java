package com.StringHandling;

public class PallindromeSubString {

	public static boolean isPallindrome(String s,int start,int end)
	{
		int i=start;
		int j=end;
		while(i<j)
		{
			if(s.charAt(i)!= s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		String s="banana";
		long start = System.currentTimeMillis();
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(isPallindrome(s, i, j))
					System.out.println(s.substring(i,j+1));
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
	}

}
