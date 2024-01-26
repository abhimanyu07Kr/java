package com_pack1;

public  class ClassI extends ClassH
{
    @Override
    public void meth1()
    {
        System.out.println("overrride done");
    }
    @Override
    public String toString()
    {
        return "this is toString";
    }
    public static void main(String[] args) {
        ClassH obj=new ClassI();
        obj.meth1();
        System.out.println(obj.equals(obj));
        System.out.println(obj);

    }
}
