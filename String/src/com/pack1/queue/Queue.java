package com.pack1.queue;

public class Queue {
	
	Object[] o;
	int count;
	
	public Queue()
	{
		o=new Object[5];
		count=0;
	}
	
	public void add(Object ele)
	{
		if(count>=o.length) increse();
		o[count]=ele;
		count++;
	}
	
	private void increse()
	{
		Object[] temp=new Object[o.length+3];
		for(int i=0;i<o.length;i++)
		{
			temp[i]=o[i];
		}
		o=temp;
	}
	
	public boolean isEmpty()
	{
		return count==0;
	}
	public int size()
	{
		return count;
	}
	public Object poll()
	{
		if(isEmpty()) return null;
		Object ele=o[0];
		for(int i=0;i<size();i++)
		{
			o[i]=o[i+1 ];
		}
		count--;
		o[count]=null;
		return ele;
	}

}
