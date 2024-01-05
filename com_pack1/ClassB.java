package com_pack1;
import java.util.Arrays;
import java.util.Scanner;

public class ClassB
{
  
  boolean firstLastSame(int [] arr)
  {
    System.out.println(Arrays.toString(arr));
    if(arr[0]==arr[arr.length-1])
    return true;
    else
    return false;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ClassB obj=new ClassB();
    int arr1[]=new int[5];
    System.out.println("enter the "+(arr1.length)+" element in Array list");
    for(int i=0;i<arr1.length;i++)
    {
      arr1[i]=sc.nextInt();
    }
    boolean b1=obj.firstLastSame(arr1);
    System.out.println("Arrays is "+Arrays.toString(arr1));
    System.out.println(b1);
    sc.close();
  }
}

