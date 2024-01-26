//implementation of final keyword
package com_pack2;

final public class Example115 // final class can not be inherite
{
    final int a=10;
    final static int b=12;
    final void meth1()// final method can not be overridden
    {
    //   System.out.println(a++);// final variable are constant
    System.out.println(a);
    }
    public static void main(String[] args) {
        new Example115().meth1();
        // System.out.println(b);
    }
}
