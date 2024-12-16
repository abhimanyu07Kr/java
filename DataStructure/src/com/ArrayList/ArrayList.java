package com.ArrayList;

import java.util.Arrays;

public class ArrayList {
	
	private static int pos;
	private Object[] a;
	
	public ArrayList()
	{
		a=new Object[5];
	}
	
	public ArrayList(int initialsize)
	{
		a=new Object[initialsize];
	}
	
	public void add(Object e)
	{
		if(pos>=a.length) increse();
		a[pos++]=e;
	}
	
	private void increse()
	{
		Object[] temp=new Object[a.length+5];
		
		for(int i=0;i<a.length;i++)
			temp[i]= a[i];
		
		a=temp;
	
	}
	 
	 public int capacity()
	 {
		 return a.length;
	 }
	
	public int size()
	{
		return pos;
	}

	public Object get(int index)
	{
		if(index<=-1 || index>=size()) 
			throw new IndexOutOfBoundsException();
		return a[index];
	}
	
	public void add(int index,Object o)
	{
		if(index<=-1 || index>size())
			throw new IndexOutOfBoundsException();
		
		if(pos>=a.length) increse();
		
		for(int i=0;i<size();i++)
		{
			a[i+1]=a[i];
		}
		a[index]=o;
		pos++;
	}
	
	public void remove(int index)
	{
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		
		for(int i=index+1;i<size();i++)
			a[i-1]=a[i];
		a[--pos]=null;
	}
	
}
