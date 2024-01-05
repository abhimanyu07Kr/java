package com_pack2;

import java.util.Arrays;

import java.util.Scanner;

public class Example81 {
    int  meth1(int []arr) 
    {
        if(arr.length>=2)
        return arr[0]+arr[1];
        else if(arr.length==1)
        return arr[0];
        else
        return 0;
    }
    public static void main(String[] args) {
        Example81 obj = new Example81();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many element insert in array ");
        int val=sc.nextInt();
        int arr1[]=new int[val];
        if(val>=1)
        System.out.println("enter the "+val+" value in array ");
        for(int i=0;i<=arr1.length-1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        int result=obj.meth1(arr1);
        System.out.println((result));
        sc.close();
    }
}

