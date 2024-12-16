package com.pack1.arrayList;

public class ArrayList {
	
	Object[] o;
	int count;
	
	public ArrayList()
	{
		o=new Object[5];
		count=0;
	}
	
	public void add(int index,Object ele)
	{
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		if(o.length<=count) increse();
		
		for(int i=count;i>=index;i--)
		{
			o[i+1]=o[i];
		}
		o[index]=ele;
		count++;
	}
	
	public void add(Object ele)
	{
		if(o.length<=count) increse();
		
		o[count]=ele;
		count++;
	}
	
	private void increse()
	{
		Object[] temp=new Object[o.length+3];
		for(int i=0;i<count;i++)
		{
			temp[i]=o[i];
		}
		o=temp;
		
	}
	public int size()
	{
		return count;
	}
	public Object get(int index)
	{
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		return o[index];
	}
	
	public int capacity()
	{
		return o.length;
	}

}
