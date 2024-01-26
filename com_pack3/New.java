package com_pack3;
import java.util.Arrays;
import java.util.Scanner;
public class New {

    public static void print(int arr[], int n)
    {
        System.out.println(Arrays.toString(arr));
        for(int i =0;i<=arr.length-1;i+=2)
        {
            System.out.print(arr[i]);
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
             arr[i]=sc.nextInt();
        }
        print(arr, n);
        sc.close();
    }
}
