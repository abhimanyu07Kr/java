package com_pack3;
public class New {

    public  int meth(int height[]) {
        int n = height.length;
        int leftmax[] = new int[n];
        System.out.println(leftmax[0]);
        return n;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 5, 7, 6, 9, 3 };
        System.out.print(new New().meth(height));
        
    }
}
