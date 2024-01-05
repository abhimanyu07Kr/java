package com_pack1;

public class patten1 
{
    public static void main(String[] args) {
        int m=5;
        for(int i=1;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i>1 && i<m-1 && j>0 && j<m-1)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println("");
        }
     
    }
}
