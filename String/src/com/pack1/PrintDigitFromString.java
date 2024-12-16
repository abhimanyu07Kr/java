package com.pack1;

public class PrintDigitFromString {
	
	public void meth1(String str)
	{
		int s=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
				s+=str.charAt(i)-'0';
		}
		System.out.println(s);
	}
	
	public void meth2(String str)
	{
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			int num=0;
			while(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				num=num*10+(str.charAt(i)-'0');
				i++;
			}
			sum+=num;
		}
		System.out.println(sum);
	}
	
	public void meth3(String str)
	{
		int i=0;
		while(i<str.length()) {
			char c=str.charAt(i);
			String s=c+"";
			
			i++;
			while(i<str.length() && c==str.charAt(i))
			{
				s+=str.charAt(i);
				i++;
			}
			
			if(s.length()>1)System.out.println(s);
		}
	}
	
	public void meth4(String str)
	{
		int i=0;
		String s="";
		while(str.length()>i)
		{
			char c=str.charAt(i);
			i++;
			int count =1;
			while(str.length()>i && c==str.charAt(i))
			{
				count++;
				i++;
			}
			if(count>1) s+=count+""+c;
			else s+=c;
		}
		System.out.println(s);
		
	}
	
	public void meth5(String str)
	{
		int i=0;
		String s="";
		while(i<str.length())
		{
			int count =0;
			
			while(str.charAt(i)>'0' && str.charAt(i)<'9')
			{
				count =count*10+ (str.charAt(i)-'0');
				
				i++;
			}
			System.out.println(count);
			for(int j=1;j<=count;j++)
			{
				s=s+str.charAt(i);
			}
			i++;
		}
		System.out.println(s);
	}
	
	public void meth6(String str)
	{
		String s="";
		while(str.length()>0)
		{
			int i=str.length();
			char c=str.charAt(0);
			str=str.replace(c+"", "");
			int l=str.length();
			s+=c+""+(i-l)+" ";
		}
		System.out.println(s);
	}
	public void meth7(String str)
	{
		String s="";
		int i=0;
		while(i<str.length())
		{
			if(str.charAt(i)>'0' && str.charAt(i)<'9')
			{
				i++;
				continue;
			}
			s+=str.charAt(i);
			i++;
		}
		System.out.println(s);
	}
	public void meth8(String str)
	{
		String[] arr = str.split(" ");
		String s="";
		for(int i=0;i<arr.length;i++)
		{
			s=s+" "+titleCase(arr[i]);
		}
		System.out.println(s);
		
	}
	public String titleCase(String s)
	{
		return s.substring(0, 1).toUpperCase()+s.substring(1, s.length()).toLowerCase();
	}
	
	public void meth9(String str)
	{
		String s2="";
		String[] arr=str.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			String s="";
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				s+=arr[i].charAt(j);
			}
			s2+=s+" ";
		}
		System.out.println(s2);
	}
	public static void main(String[] args) {
		PrintDigitFromString p = new PrintDigitFromString();
		p.meth9("java is a programming lang");
	}

}
