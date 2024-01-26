//Garbage collection
package com_pack2;
public class Example116 
{
    void meth1()
    {
        System.out.println("meth1() called");
        new Example116();
    }
    protected void finalize()
    {
        System.out.println("garbage collected");
    }
    public static void main(String[] args) {
        Example116 obj1=new Example116();
        Example116 obj2=new Example116();

        System.out.println("obj1 : "+obj1.hashCode());
        System.out.println("obj2 : "+obj2.hashCode());

        obj1.meth1();
        // obj2=obj1;//1st way reassigning the value
        // obj2=null;//2nd way nullining the object value
        System.gc();
        System.out.println("obj1 : "+obj1.hashCode());
        System.out.println("obj2 : "+obj2.hashCode());
        try {
            System.out.println("try block executed ");
            System.out.println("obj2 : "+obj2.hashCode());
        } catch (Exception e) {
            System.out.println("catch block executed ");
            e.printStackTrace();
        }
        finally{
            System.out.println("finally block executed");
        }
        System.out.println("---------------------");
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
    }
}