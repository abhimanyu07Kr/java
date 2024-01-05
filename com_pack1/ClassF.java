package com_pack1;

public class ClassF 
{
    public String firstHalf(String str)
    {
        int s=str.length();
        System.out.println("String length is :"+s);
        if(s%2==0)
       {
         return str.substring(0, str.length()/2);
       }
       else
       return "this string length is odd";
    }    
    public static void main(String[] args) {
        ClassF obj = new ClassF();
        String s = obj.firstHalf("abhimanyukumar");
        StringBuffer sb=new StringBuffer();
        sb.append("duhsu");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(s);

    }
}
