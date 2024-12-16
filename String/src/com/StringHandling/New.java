package com.StringHandling;

public class New {
	
	
	int strstr(String s, String x)
    {
       // Your code here
       int i=0;
       int st=0;
       while(i<s.length())
       {
           int j=0;
           st=i;
          while(s.charAt(i)==x.charAt(j))
          {
        	  System.out.println(s.charAt(i)+" "+i+" "+x.charAt(j));
        	  i++;
        	  j++;
        	  if(j==x.length())return st;
          }
          
           i++;
       }
       return -1;
    }
	public static void main(String[] args) {
		New n = new New();
		int strstr = n.strstr("QeYncKvfuYvWzGCxIpltSy ycfQ", "ycfQ");
		System.out.println(strstr);
				
	}

}
