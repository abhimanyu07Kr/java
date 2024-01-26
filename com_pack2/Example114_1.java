package com_pack2;

public class Example114_1 
{
    public static void main(String[] args) {
        Example114 obj=new Example114();
        new Thread()
        { // Ananymous inner class start here
            @Override
            public void run()
            {
                try {
                    
                    obj.with_draw(800000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();//Ananymous inner class end here

        new Thread()
        {
            @Override
            public void run()
            {
                obj.deposit(60000);
            }
        }.start();
        
    }
}
