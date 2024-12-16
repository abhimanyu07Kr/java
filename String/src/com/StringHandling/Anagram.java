package com.StringHandling;

public class Anagram {
	
	// silent 
	// listen
	
	public boolean isAnangram(String s1,String s2)
	{
		if(s1.length()!=s2.length()) return false;
		
		while(s1.length()>0)
		{
			char c=s1.charAt(0);
			s1=s1.replace(c+"", "");
			s2=s2.replace(c+"", "");
			
			if(s1.length()!=s2.length()) return false;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		boolean b=new Anagram().isAnangram("silient", "listen");
		System.out.println(b);
	}

}
