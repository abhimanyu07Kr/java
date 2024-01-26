package itsMind;

import java.util.Scanner;

public class ClassD 
{
    Scanner sc=new Scanner(System.in);
    void meth1()
    {
        System.out.println("enter the value of n ");
        int n=sc.nextInt();
        char k='A';
                
        for(int i=1;i<=n;i++)
        {
            // for (int j=1; j<=n-i; j++)
            // {
            //     System.out.print(" ");
            // }
            for(int j=1;j<=n;j++)
            {
                System.out.print(" "+(k));
                k++;
            }
            
            System.out.println();
        }
    }  
    public static void main(String[] args) {
        new ClassD().meth1();
    }  
}
