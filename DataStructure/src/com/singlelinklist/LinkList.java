package com.singlelinklist;

public class LinkList {
	
	Node head;
	int count=0;
	
	public void add(Object ele)
	{
		Node n = new Node(ele);
		if(head==null)
		{
			head=n;
			count++;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
			
		}
		temp.next=n;
		count++;
	}
	
	public Object get(int index)
	{
		if(index<0 || index>size())
			return new IndexOutOfBoundsException();
		
		Node temp=head;
		for(int i=0;i<index;i++)
			temp=temp.next;
		
		return temp.ele;
	}
	
	public int size()
	{
		return count;
	}
	
	public void add(int index,Object ele)
	{
		if(index<0 || index>size()) throw new IndexOutOfBoundsException();
		Node n=new Node(ele);
		if(index==0)
		{
			
			n.next=head;
			head=n;
			count++;
			return;
		}
		Node temp=head;
		for(int i=0;i<index-1;i++)
		{
			temp=temp.next;
		} 
			Node prev=temp;
			n.next=prev.next;
			prev.next=n;
			count++;
		
		
		
	}

}
