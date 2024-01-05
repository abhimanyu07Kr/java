package com_pack2;

import java.util.Scanner;
import java.util.Arrays;

public class Example80 
{
    Scanner sc=new Scanner(System.in);
  int []meth1()
  {
     System.out.println("enter the size of Array");
    int val=sc.nextInt();
   
    int arr[]=new int[val];
    System.out.println("enter "+arr.length+" element in Array");
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    
        System.out.println("Array is "+Arrays.toString(arr));
        {
        for(int j=0;j<arr.length-1;j++)
        
            if(arr[j]==2 && arr[j+1]==3)
            arr[j+1]=0;
        }
    
    return arr;
  }  
  public static void main(String[] args) {
    Example80 obj = new Example80();
    int result[]=obj.meth1();
    System.out.println("regenereted array is :-\n"+Arrays.toString(result));
  }
}

