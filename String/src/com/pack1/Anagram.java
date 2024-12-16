package com.pack1;

public class Anagram {
	
	public boolean isAnagram(String str1, String str2)
	{
		if(str1.length()!=str2.length()) return false;
		
		while(str1.length()>0)
		{
			char c=str1.charAt(0);
			str1=str1.replace(c+"", "");
			str2=str2.replace(c+"", "");
		
			if(str1.length()!=str2.length()) return false;

		}
		return true;
	}
	
	
	public void size()
	{
		String s="sharmila";
		
		
		System.out.println(s.length()-1);
	}
	
	public static void main(String[] args) {
		Anagram obj = new Anagram();
//		boolean b = obj.isAnagram("", "");
//		System.out.println(b);
		obj.size();
	}

}
