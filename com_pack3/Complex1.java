package com_pack3;

class Complex1
{ 
    int real;
    int imag;
    public Complex1(int  r,int i)//4,5 && 9,4
    {
        real=r;
        imag=i;
    }
    public static Complex1 add(Complex1 a,Complex1 b)
    {
        return new  Complex1((a.real+b.real),(a.imag+b.imag));
    }
    public static Complex1 diff(Complex1 a,Complex1 b)
    {
        return  new Complex1((a.real-b.real),(a.imag-b.imag));
    }
    public static Complex1 product(Complex1 a,Complex1 b)
    {
        return new Complex1(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
    }
    public void printComplex1()
    {
        if(real==0&&imag!=0){
            System.out.println(imag+"i");
            }
          else if(imag==0&&real!=0)
          { System.out.println(real);
         }else{System.out.println(real+"+"+imag+"i");
}
}
}
class Solution
{
    public static void main(String  args[])
    {
        Complex1 c=new Complex1(4,5);
        Complex1 d=new Complex1(9,4);
        Complex1 e=Complex1.add(c,d);
        Complex1 f=Complex1.diff(c,d);
        Complex1 g=Complex1.product(c,d);
        e.printComplex1();
        f.printComplex1();
        g.printComplex1();
    }}
