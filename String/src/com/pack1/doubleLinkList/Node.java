package com.pack1.doubleLinkList;

public class Node {
	
	Node next;
	Node prev;
	Object ele;
	
	public Node(Object ele,Node next, Node prev)
	{
		this.ele=ele;
		this.next=next;
		this.prev=prev;
	}

}
