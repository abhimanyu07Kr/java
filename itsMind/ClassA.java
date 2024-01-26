package itsMind;

import java.util.Scanner;

public class ClassA 
{
    public static void Votes(int age)
    {
        if(age>=60)
        {
            System.out.println(age);
            System.out.println("You're welcome and you got one horlicks packet form govt.");
        }
        else if(age>=18)
        {
            System.out.println(age);
         System.out.println("You're welcome to give vote!");
        }
        
        else{
            System.out.println(age);
            int wait = 18-age;
            System.out.println("Are you kid and Wait for " + wait +" year...");

        }
    }
    public static void main(String gh[])
    {
        System.out.println("Enter your age be like 2002 and 2024");
        Scanner sc=new Scanner(System.in);
        int age=2024-(sc.nextInt());
        Votes(age);
        sc.close();
    }
}
