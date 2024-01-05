//Polymorphism  
// method overriding
//run time polymorphism
package com_pack2;

public class Example96 
{
    void meth1()
    {
       System.out.println("method 1 execute");
    }
    Example96 meth2()
    {
        System.out.println("method 2 execute");
        return this;
    }
}
