package com.Abhi;

public class BinarySearch {
	
	public static int search(int[] a,int key)
	{
		
		int st=0;
		int end=a.length-1;
		while(st<=end)
		{
			int mid=(st+end)/2;
			if(a[mid]==key)return mid;
			else if(key<a[mid]) end=mid-1;
			else st=mid+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int a[]= {2,4,8,9,12,47};
		System.out.println(search(a, 4));
		
	}

}
