package itsMind;

import java.util.Scanner;

public class ClassE 
{
    Scanner sc=new Scanner(System.in);
    void meth1()
    {
        System.out.println("enter the value of n ");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        System.out.println("enter the value of elements ");
        for (int i = 0; i < arr1.length; i++) 
        {
            arr1[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<=arr1.length-1;i++)
        {
            sum+=arr1[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        new ClassE().meth1();
    }
}
