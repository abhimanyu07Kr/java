package com_pack2;

public class Example114 
{
    int amount=10000;// instance variable
    synchronized void with_draw(int amount) throws Exception
    {
        if(this.amount<amount)//10000<
        {
            System.out.println("insufficient blance");
            wait();
            Thread.sleep(10000);
            System.out.println("amount credited");
            this.amount-=amount;
            if(this.amount<=0)
            {
                Thread.sleep(3000);
                System.out.println("you want to withdraw RS "+amount);
            System.out.println("insufficient blance  ");
            }
            else
            {
                System.out.println("with draw successful in balance is "+this.amount);
            }
        }
    
        
        else
        {
            this.amount-=amount;
            if(this.amount>=0)
            {
            System.out.println("insufficient blance");
            }
            else
            {
                System.out.println("with draw successful in balance is "+this.amount);
            }
        }
    }
    synchronized void deposit(int amount)
    {
        
        
        
        this.amount+=amount;
        System.out.println("depositd successful \n balance is "+this.amount);
        notify();
        
        // notifyAll();
    }
}
