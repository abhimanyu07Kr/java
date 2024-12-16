package com.Abhi;

import java.util.Arrays;

public class SelectionSort {
	
	public static void sort(int a[])
	{
		for(int i=0;i<=a.length-2;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[min]) min=j;
				
				if(i!=min)
				{
					int temp=a[min];
					a[min]=a[i];
					a[i]=temp;
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
