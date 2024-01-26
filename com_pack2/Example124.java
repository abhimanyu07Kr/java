package com_pack2;

import java.util.Enumeration;
import java.util.Vector;

import java.util.Iterator;

public class Example124 
{
    void meth1()
    {
        System.out.println("implementing Vector ");
    Vector<Object> v=new Vector<Object>();
    v.add(10);
    v.add("java");
    v.add(true);
    v.add(10);
    v.add(89);
    v.add(748);
    v.add(67);
    v.add(98);
    System.out.println(v);
    System.out.println("\nreteriving the data by using for-loop");
        for(int i=0;i<=v.size()-1;i++)
        {
            System.out.print(v.get(i)+" ");
        }
        System.out.println("\n");
        System.out.println("reteriving the data in reverse order by using for-loop");
        for(int i=v.size()-1;i>0;i--)
        {
            System.out.print(v.get(i)+" ");
        }
        System.out.println("\n");
        System.out.println("reteriving the data in reverse order by using for-loop");
        for (Object o : v) 
        {
            System.out.print(o+" ");    
        }
        System.out.println("\n");
        System.out.println("reteriving the data by Enumeration Inteface");
        Enumeration<Object> e=v.elements();
        while (e.hasMoreElements()) 
        {
            System.out.print(e.nextElement()+" ");
        }
        System.out.println("\n");
        System.out.println("reteriving the data by Iterator Inteface");
        Iterator <Object> i=v.iterator();
        while (i.hasNext()) 
        {
            System.out.print(i.next()+" ");    
        }
        System.out.println("\n");
        System.out.println("size :"+v.size());
        System.out.println("capacity :"+v.capacity());
        v.add(v.size(),300);
        v.add(v.size()-1,900);
        v.add(3,400);
        System.out.println(v);
        System.out.println("size :"+v.size());
        System.out.println("Capacity :"+v.capacity());
        v.clear();
        System.out.println(v);
        }
        public void finalize()
        {
            System.out.println("gabage collected");
        }
    public static void main(String[] args) {
        Example124 obj=new Example124();
        obj.meth1();
        obj=null;
        System.gc();

    }
}
