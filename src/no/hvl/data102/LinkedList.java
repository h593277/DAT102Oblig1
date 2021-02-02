package no.hvl.data102;

import java.util.Iterator;

public class LinkedList<T> {

	private Node head;
	private int antall = 0;
	
	
	public Object[] arrayKonvertering()
	{
		Object[] array = new Object[antall];
		Node currNode = head;
		for(int i = 0; i < antall; i++)
		{
				array[i] = currNode;
				currNode = currNode.nextNode;
		}
		
		return array;
	}
	
	
	public void insert(T data)
	{
		Node newNode = new Node(data);
		newNode.nextNode = null;
		
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			Node last = head;
			while(last.nextNode != null)
			{
				last = last.nextNode;
			}
			
			last.nextNode = newNode;
		}
		antall++;
		
		
	}
	
	public boolean remove(T data)
	{
		boolean removed = false;
		Node previousNode = null;
		Node currNode = head;

		if(currNode != null && currNode.data == data)
		{
			head = currNode.nextNode;
			removed = true;
		}
	
		while(currNode != null && currNode.data != data)
		{
			previousNode = currNode;
			currNode = currNode.nextNode;
		}
		
		if(currNode != null)
		{
			removed = true;
			antall--;
		}
		previousNode.nextNode = currNode.nextNode;
	
		
		return removed;
	}
	
	public boolean find(T data)
	{
		boolean exist = false;
		Node currNode = head;
	
		for(int i = 0; i < antall; i++)
		{
			if(currNode.data == data)
			{
				exist = true;
			}
			else
			{
				currNode = currNode.nextNode;
			}
		}
	
		
		return exist;
	}
	
	
	public void printList()
	{
		Node currNode = head;
		
		System.out.println("Linked List: ");
		
		while(currNode != null)
		{
			System.out.println(currNode.data + " ");
			currNode = currNode.nextNode;
		}
	}
	
	public int size()
	{
		return antall;
	}
	
	class KjedetIterator<T> implements Iterable<T>
	{
		@Override
		public boolean hasNext() {
			Node current = head;
			return current != null;
			
		}


		@Override
		public T next() {
			Node current = head;	
			if(current.nextNode != null)
			{
				T data = current.data;
				current = current.nextNode;
				return data;
			}
			return null;
		}

		@Override
		public java.util.Iterator<T> iterator() {
			Iterator<T> t = new Iterator<T>();
			return t;
		}

	}

	
}
