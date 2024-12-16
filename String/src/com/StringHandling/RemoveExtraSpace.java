package com.StringHandling;

public class RemoveExtraSpace {
	
	public static void meth(String s)
	{
		String s1="";
		for(int i=0;i<=s.length()-2;i++)
		{
			if(s.charAt(i)!=' ' && s.charAt(i+1)==' ' )
				s1+=s.charAt(i);
			
//			if(s.charAt(i)!=' ')
//				s1+=s.charAt(i);
		}
		System.out.println(s1);
	}
	public static void main(String[] args) {
		meth("abhimanyu   kumar");
	}

}
