//Polymorphism 
// complie time polymorphism
//method overloading
package com_pack2;
public class Example94 
{
    void meth1()
    {
        System.out.println(10+'a');
        int a=this.meth1("hello");
        System.out.println(a);
    }
    int meth1(String s)
    {
        String str=meth1("hello", (byte)10);
        System.out.println(str);
        return 'A';
    }
    private String meth1(String s,byte b)
    {
        return s;
    }
    Example94 meth1(boolean b)
    {
        System.out.println(b);
        return this;
    }
    public static void main(String[] args) {
        Example94 obj = new Example94();
        obj.meth1();
        obj.meth1(true);
    }
}
