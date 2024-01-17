// Garbage collection
package com_pack2;

public class Example13 
{
    void meth1()
    {
        System.out.println("method 1 called");
    }
    protected void finalize()
    {
        System.out.println("garbage collected");
    }
    public static void main(String[] args) {
        Example13 obj=new Example13();
        // Example13 obj1=new Example13();
        obj.meth1();
        obj=null;
        System.gc();
    }
}
