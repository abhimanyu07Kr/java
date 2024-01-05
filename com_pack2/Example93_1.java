package com_pack2;
public class Example93_1 extends Example93
{
    void display()
    {
        System.out.println("hi");
        super.meth4();
    }
    static int show(int a)
    {
        System.out.println(a+a);
        return a+a++;
    }
    Example93_1()
    {
        this(show(50));
        // for(int i=1;;i++)
        // {
        //     super.meth4();
        //     break;
        // }
            System.out.println("hi");
            System.out.println(show(50));
    }
    Example93_1(int a)
    {
        System.out.println("==>"+(a+++show(50)));
    }
    public static void main(String[] args) {
        new Example93_1().display();
    }
}
