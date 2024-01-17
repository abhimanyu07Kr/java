// Understanding join() in Thread class
package com_pack2;

public class Example107 implements Runnable
{
 @Override
 public void run()
 {
    for (int i = 0; i <=5; i++) 
    {
        System.out.println("class A Thread "+i);
    }
 }
    public static void main(String[] args) throws Exception {
        Example107 obj=new Example107();
        Thread t1=new Thread(obj);
        t1.start();
        t1.join();

        for (int i = 0; i <=5; i++) 
        {
            System.out.println("class B Thread "+i);
        }
    }
}
