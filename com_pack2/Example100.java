package com_pack2;

import java.util.Scanner;

public class Example100 
{
   
   void meth1()
   {
    Scanner sc=new Scanner(System.in);
    String s = null;
    System.out.println(s);
    try
    {
        System.out.println("this is try block");
        System.out.println(20/sc.nextFloat());
    }
    catch(ArithmeticException ae)
    {
        System.out.println("this is catch block");
    }
    finally{
        System.out.println("this is finally block");
    }
    System.out.println("hello");
    sc.close();
   } 
   public static void main(String[] args) {
    Example100 obj=new Example100();
    obj.meth1();
   }
}
