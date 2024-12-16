package com.Abhi;

import java.util.Arrays;

public class BubbleSort {
	
	public static void sort(int[] a)
	{
		for(int i=0;i<=a.length-2;i++) {
			for(int j=0;j<=a.length-2-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int a[]= {9,4,5,2,6,1,8,3};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
