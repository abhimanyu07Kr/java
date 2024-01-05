package com_pack2;

public class Example96_1 extends Example96
{
    protected void meth1()
    {
        System.out.println("meth 1 excute");
        super.meth1();
    }
    Example96_1 meth2()
    {
        System.out.println("meth 2 execute");
        return this;
    }
    public static void main(String[] args) {
        Example96 obj = new Example96_1();
        obj.meth1();
        obj.meth2();
    }
}
