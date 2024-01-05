package com_pack3;

import com_pack2.Example89;

public class Example89_1 
{
    void meth1()
    {
        Example89 obj =new Example89();
        obj.setsBranch("cse");
        obj.setsId(101);
        obj.setsName("abhimanyu");

        System.out.println(obj.getsName());
        System.out.println(obj.getsId());
        System.out.println(obj.getsBranch());
    }
    public static void main(String[] args) {
        new Example89_1().meth1();
    }
    
}
