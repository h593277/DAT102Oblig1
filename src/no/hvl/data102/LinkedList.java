package no.hvl.data102;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

	private Node head;
	private int antall = 0;
	
	public Iterator<T> iterator()
	{
		return new kjedetIterator<T>(this);
	}
	
	public Node getHead()
	{
		return head;
	}
	
	//Ble dessverre bandaid løsning å gjøre den til film
	public Film[] arrayKonvertering()
	{
		Film[] array = new Film[antall];
		Node currNode = head;
		for(int i = 0; i < antall; i++)
		{
				array[i] = (Film) currNode.data;
				currNode = currNode.nextNode;
		}
		
		return array;
	}
	
	
	public void settInn(T data)
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
	
	public boolean fjern(T data)
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
	
	public boolean finn(T data)
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
	
	class kjedetIterator<T> implements Iterator<T>
	{
		Node<T> curr;
		public kjedetIterator(LinkedList<T> liste)
		{
			curr = liste.getHead();
		}
		

		
		@Override
		public boolean hasNext() {
			return curr != null;
			
		}


		@Override
		public T next() {
			if(curr.nextNode != null)
			{
				T data = curr.data;
				curr = curr.nextNode;
				return data;
			}
			return null;
		}

		

	}

	
}
