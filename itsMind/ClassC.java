package itsMind;

import java.time.LocalDate;
import java.util.Scanner;


public class ClassC 
{
    Scanner sc=new Scanner(System.in);
    void meth1()
    {
        
        
        int days=24;
        int months=12;
        int years=2021;
        System.out.println("enter the birth date\n like=10 12 2001");
        System.out.print((days%sc.nextInt())+"-"+(months%sc.nextInt())+"-"+(years%sc.nextInt()));

    }
    public static void main(String[] args) {
        new ClassC().meth1();
        
}  
} 


