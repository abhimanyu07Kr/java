package com.StringHandling;

public class ArrangeLetter {
	
	
	public void letter(String s)
	{
		
		long start=System.currentTimeMillis();
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		StringBuilder s3 = new StringBuilder();
		StringBuilder s4 = new StringBuilder();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				s1.append(s.charAt(i));
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				s2.append(s.charAt(i));
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				s3.append(s.charAt(i));
			}else
			{
				s4.append(s.charAt(i));
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		System.out.println(s1+""+s2+""+s3+""+s4);
	}
	
	
	public static void main(String[] args) {
		new ArrangeLetter().letter("3892Ab@*&^%D83");
	}

}
