package itsMind;

import java.util.Scanner;

public class ClassB 

{
    void meth1(int n)
    {
        Scanner sc=new Scanner(System.in);
        int bjp=0;
        int cnj=0;
        int aap=0;
        
        for(int i=1;i<=n;i++)
        {
            System.out.println("press 1 for bjp\n press 2 for cnj\n press 3 for aap\n");
            int x=sc.nextInt();
            switch (x) {
                case 1:
                System.out.println("thank you for voting bjp\n");
                    ++bjp;
                    break;
                case 2:
                    ++cnj;
                    System.out.println("thank you for voting cnj\n");
                    break;
                case 3:
                    ++aap;
                    System.out.println("thank you for voting aap\n ");
                    break;        
            
                default:
                    System.out.println("enter the valid button\n");
                    break;
            }
        }
            System.out.println("\nbjp "+bjp);
            System.err.println("cnj "+cnj);
            System.out.println("aap "+aap);


            if(bjp>cnj && bjp>aap)
            {
                System.out.println("winner is bjp");
            }
            else if(cnj>aap && cnj>bjp)
            {
                System.out.println("winner is cnj");
            }
                        else if(aap>bjp && aap>cnj)
            {
                System.out.println("winner is aap");
            }
            else 
            {
                System.out.println("election is draw");
            }
        sc.close();
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the candiate no.");
        int x=sc.nextInt();
        new ClassB().meth1(x);
        sc.close();
    }
}
