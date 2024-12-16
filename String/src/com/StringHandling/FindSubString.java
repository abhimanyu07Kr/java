package com.StringHandling;

public class FindSubString {
	
	
	String removeCharacters(String S) {
        // code here
        String str="";
        int i=0;
        while(i<S.length())
        {
            char c=S.charAt(i);
            if(S.charAt(i)>='0' && S.charAt(i)<='9')
            {
                str+=c+"";
            }
            i++;
        }
        return str;
    }
	public static void main(String[] args) {
		String s1 = new FindSubString().removeCharacters("Vu0dLF");
		System.out.println(s1);
	}

}
