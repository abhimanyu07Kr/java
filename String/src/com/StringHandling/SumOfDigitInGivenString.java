package com.StringHandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SumOfDigitInGivenString {
	
	public String longest(List<String> names) {
        // code here
        
        int length=0;
        int index=0;
        int i=0;
        for(String s:names)
        {
        	
        	int length2 = s.length();
        	if(length<length2)
        	{
        		length=length2;
        		index=i;
        	}
        	i++;
        }
        return names.get(index);
    }
	public void meth(int[] a)
	{
		int length=0;
		int index=0;
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
			
		}
	}
	 public String chartostr(char arr[], int N){
	        
	        String s="";
	        for(char c:arr)
	        {
	            s+=(arr+"");
	        }
	        return s;
	    }
	 
	 String encryptString(String s) 
	    {
	        // code here
	        
		 int i=0;
	        StringBuilder str=new StringBuilder();
	        char[] c=s.toCharArray();
	        while(i<c.length)
	        {
	            int count =1;
	            char a=c[i];
	            i++;
	            while(i<c.length && c[i]==a)
	            {
	                count++;
	                i++;
	            }
	            str.append(str.append( ""+a+count));
	        }
	        
	        StringBuilder s2=new StringBuilder();
	        for(int k=str.length()-1;k>=0;k--)
	        {
	           s2.append(str.charAt(k)); 
	        }
	        String s3=s2.toString();
	       
	         return s3;
	    }
	 int getCount (String S, int N)
	    {
	        // your code here
	        
	        int count=0;
	        String s2="";
	        
	        while(S.length()>0)
	        {
	        	char c = S.charAt(0);
	        	s2=S.replace(c+"", "");
	        	int n=S.length()-s2.length();
	        	System.out.println(c+" "+n);
	        	S=s2;
	        	if(n>=N)
	        	{
	        		count++;
	        	}
	        }
	        System.out.println(count);
	        return count;
	    }
	 
	 static String removeChars(String string1, String string2){
	        // code here
	        
	        while(string2.length()>0)
	        {
	            char c=string2.charAt(0);
	          String  s2=string1.replace(c+"","");
	            string1=s2;
	            string2=string2.replace(c+"", "");
	            
	        }
	        return string1;
	    }
	 
	 String removeSpecialCharacter(String s) {
	        // code here
	        String str="";
	        for(int i=0;i<=s.length()-1;i++)
	        {
	            if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')
	            {
	                str+=s.charAt(i)+"";
	            }
	        }
	        
	        return str;
	    }
	 
	 
	 
	 int findLength(String s) 
	    { 
	        // code here
	        
	        
	        String[] arr=s.split(" ");
	        String S=arr[arr.length-1];
	        int i=S.length();
	        System.out.println(S);
	        System.out.println(i);
	        return 0;
	    }
	 
	 static int extractMaximum(String S) 
	    { 
	        // code here
	        
	        int i=0;
	        int sum=0;
	        while(i<S.length())
	        {
	            int count=0;
	            while(i<S.length() && S.charAt(i)>='0' && S.charAt(i)<='9')
	            {
	                count=count*10+(S.charAt(i)-'0');
	                i++;
	                // System.out.println(sum);
	            }
	            i++;
	            if(sum<count)sum=count;
//	             System.out.println(count);
	        }
	        return sum;
	    }
	 
	 public static void removeSpace()
	 {
		 String s="this          is     java    ";
		 String s1=""; 
		 for(int i=0;i<s.length();i++)
		 {
			 if(i<s.length()-1) {
			if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
			{
				continue;
			}
			s1+=s.charAt(i);
			 }
		 }
		 System.out.println(s1);
		 
	 }
	 
	 static void sum()
	 {
		 int n=123;
		 int m=0;
		 int i=1;
		 while(n>0)
		 {
			 int last=n%10;
			 m=last*i+m;
			 n/=10;
			 i*=10;
		 }
		 System.out.println(m);
	 }
	 public static long findSum(String str)
	    {
	        // your code here
	        int sum=0;
	        int i=0;
	        while(str.length()>i)
	        {
	            int n=0;
	            while(str.length()>i && str.charAt(i)>='0' && str.charAt(i)<='9')
	            {
	                n=n*10+(str.charAt(i)-'0');
	                i++;
	            }
	            sum+=n;
	            i++;
	        }
	        return sum;
	    }
	 
	 static void find2No()
	 {
		 int i=0,sum=0;
		 String str="a10a23";
		 while(str.length()>i)
		 {
			 int var=0;
			 int j=1;
			 while(str.length()>i && str.charAt(i)>='0' && str.charAt(i)<='9')
			 {
				 var=var*j+(str.charAt(i)-'0');
				 i++;
				 j*=10;
				 
			 }
			 i++;
			 sum+=var; 
		 }
		 System.out.println(sum);
	 }
	public static void main(String[] args) {
		SumOfDigitInGivenString obj = new SumOfDigitInGivenString();
		
//		int i = extractMaximum("100klh56abc35bg");
//		System.out.println(i);
//		removeSpace();
//		sum();
		find2No();
//		long sum = findSum("dasj10jdhs12");
//		System.out.println(sum);
		
	}
}
