package com_pack2;

public class Example105 implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i<=5; i++) 
        {
            System.out.println("hello");
        }
    }
    public static void main(String[] args) {
        Example105 obj=new Example105();
        Thread t1=new Thread(obj);
        t1.start();
        System.out.println("--------------");
        t1.run();
    }
}
