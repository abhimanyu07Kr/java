package com_pack1;

public class Classc 
{
    public long primeFactorsSum(long x) {
        int sum = 0;

        for (long i = 2; i * i <= x; i++) {
            while (x % i == 0) {
                x /= i;
                sum++;
                System.out.println((i));
            }
        }

        if (x > 1) {
            sum++;
        }

        return sum;
    }

public long helloName(long a, long b)
{
    long totalsum =0;
    for(long i=a;i<=b;i++)
    {
         totalsum += this.primeFactorsSum(i);
        // System.out.println(i);
    }
    
    return totalsum;
}
public static void main(String[] args) {
    Classc obj = new Classc();
    long x=obj.helloName(24, 27);
    System.out.println(x);
    }
}
