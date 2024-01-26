package com_pack2;

import java.util.ArrayList;
import java.util.Iterator;

public class Example122 
{
    void meth1()
    {
        System.out.println("implementing ArrayList ");
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(10);
        // al.add("java");
        al.add(20);
        al.add(null);
        al.add(5000);
        System.out.println(al);
        System.out.println("size of al element :-"+al.size());
         
        ArrayList<Integer> abl=new ArrayList<Integer>();
        abl=al;
        
        abl.add(99);
        al.clone();
        // al.clear();
        System.out.println(abl);
        System.out.println("size of abl element :-"+abl.size());
        System.out.println(abl.get(0));
        System.out.println(abl.get(abl.size()-1));
        System.out.println();
        System.out.println("reteriving the data by using for-loop");
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");
        }
        System.out.println();

        System.out.println("reteriving the data in invese by using for-loop");

        for (int i = abl.size()-1; i > 0; i--) 
        {
            System.out.print(abl.get(i)+" ");
        }
        System.out.println();
        System.out.println("reteriving the data by using for-each-loop");

        for (Integer x : al) 
        {
            System.out.print(x +" ");
        }
        System.out.println();
        System.out.println("reteriving the data by using Iterator Interface");
        Iterator<Integer> it=al.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println("\n");
        System.out.println("contain() "+al.contains(5000));
        System.out.println("contains() "+al.remove((Object)5000));
        System.out.println(al);


    }
    

    public static void main(String[] args) {
        Example122 obj=new Example122();
        obj.meth1();
    }
}
