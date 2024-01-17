package com_pack2;

public class Example106 implements Runnable
{
    @Override
    public void run()
    {
        String name=Thread.currentThread().getName();
        int priority=Thread.currentThread().getPriority();
        for (int i = 0; i<=5; i++) 
        {
            System.out.println(name+"("+priority+")"+"has executed run(): "+i);
        }
    }
    public static void main(String[] args) {
        Example106 obj=new Example106();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);

        t1.setName("FIRST_THREAD");
        t2.setName("SECOND_THREAD");

        t1.setPriority(1);
        try {
            System.out.println("try block executed ");
            t2.setPriority(1000);
        } catch (Exception e) {
            System.out.println("catch block executed");
        }
        finally
        {
            System.out.println("finally block excuted ");
        }
        
        t1.start();
        t2.start();
    }
}
