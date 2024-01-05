package com_pack1;
import java.util.Arrays;
import java.util.Scanner;
public class ClassA 
{
boolean same(int []a,int []b)
{
    System.out.print("Array A is "+Arrays.toString(a)+"  ");
    System.out.println("Arrays B is "+Arrays.toString(b));
    if(a[0]==b[0] && a[a.length-1]==b[b.length-1])
    return true;
    else
    return false;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a1[]=new int[5];
    int b1[]=new int[5];
    System.out.println("enter the "+(a1.length)+" element in A array");
    for(int i=0;i<a1.length;i++)
    {
        a1[i]=sc.nextInt();
    }
    //    System.out.println("Array A is "+Arrays.toString(a1));
    System.out.println("\n");
       System.out.println("enter the "+(b1.length)+" element in A array");
    for(int j=0;j<b1.length;j++)
    {
        b1[j]=sc.nextInt();
    }
    // System.out.println("Arrays B is "+Arrays.toString(b1));
    boolean result=new ClassA().same(a1, b1);
    System.out.println(result);
    sc.close();
}
}
