package com_pack1;

import java.util.Scanner;

public class ClassG 
{
    static void meth(int n)
    {
        int a;
        for(int i=1;i<=10;i++)
        {
            a=n*i;
            if(a%2!=0)
               System.out.println(a);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no. which you want to print the table ");
        meth(sc.nextInt());
        sc.close();
    }
}
