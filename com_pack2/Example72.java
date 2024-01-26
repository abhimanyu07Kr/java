package com_pack2;

import java.util.Arrays;
import java.util.Scanner;

public class Example72 
{
    Scanner sc = new Scanner(System.in);
    void meth1()
    {
        String str="hello";
        int arr1[]=new int[]{10,20,30,40,50,60};
        System.out.println("enter the element in array");
        // for (int i = 0; i <=arr1.length-1; i++) 
        // {
        //     arr1[i]=sc.nextInt();
        // }
        System.out.println(Arrays.toString(arr1));
        System.out.println("String length "+str.length());
        System.out.println("Arrays length "+arr1.length);
        try
        {
            System.out.println("try block executed");
            System.out.println(arr1[-1]);
        }
        catch(ArrayIndexOutOfBoundsException aiobe)
        {
            System.out.println("catch block executed");
            aiobe.printStackTrace();
        }
        finally
        {
            System.out.println("finally block executed");
        }
        System.out.println("arr[3] :"+arr1[3]);
        System.out.println(arr1);
        System.out.println(arr1.toString());
        System.out.println(arr1.toString().equals(arr1.toString()));
    }
    static void meth2()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("which movie you want to see ");
        String mName=sc.next();
        System.out.println("how many ticket you want to book ");
        int ticket=sc.nextInt();
        String name[]=new String[ticket];
        System.out.println("plz enter your names");
        for(int i=0;i<=name.length-1;i++)
        {
            name[i]=sc.next();
        }

        System.out.println("\n");
        System.out.println("your ticket is booked");
        System.out.println("mpvie name : "+mName);
        System.out.println("total seat : "+ticket);
        int b=1;
        for(int i=0;i<=name.length-1;i++)
        {
            System.out.println(b++ +">."+name[i]);
        }
        sc.close();
    }
    public static void main(String[] args) {
        new Example72().meth1();
        meth2();
    }
}
