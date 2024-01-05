//Thread
package com_pack2;

public class Example104 implements Runnable
{
    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        System.out.println("Run() method "+i);
    }
    public static void main(String [] args)
    {
        Example104 obj=new Example104();
        Thread t1=new Thread(obj);
        // t1.start();
        t1.run();
        
    }
}