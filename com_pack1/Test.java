package com_pack1;

public class Test 
{
//   public long sum(int n)
//   {
//       long sum=0;
//     //   for(long i=0;i<=n;i++)
//     //   {
//     //       sum += i;
//     //   }
//       sum = n*(n+1)/2;
//       return sum;
//   }
//   public static void main(String[] args) {
//       Test obj=new Test();
//       long x=obj.sum(6);
//       System.out.println(x);
//   }


public static void number(int n)
{
    int i=1;
    if(i<n)   //
        number(n-1);
    System.out.println(n);
}
    public static void main(String[] args) {
        number(64);
    }
}
