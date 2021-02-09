package no.hvl.data102;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

	private Node<T> head;
	private int antall = 0;
	
	public Iterator<T> iterator()
	{
		return new kjedetIterator<T>(this);
	}
	
	public Node<T> getHead()
	{
		return head;
	}
	
	//Ble dessverre bandaid løsning å gjøre den til film
	public Film[] arrayKonvertering()
	{
		Film[] array = new Film[antall];
		Node<T> currNode = head;
		for(int i = 0; i < antall; i++)
		{
				array[i] = (Film) currNode.getData();
				currNode = currNode.getNextNode();
		}
		
		return array;
	}
	
	
	public void settInn(T data)
	{
		Node<T> newNode = new Node(data);
		newNode.setNextNode(null);
		
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			Node<T> last = head;
			while(last.getNextNode() != null)
			{
				last = last.getNextNode();
			}
			
			last.setNextNode(newNode);
		}
		antall++;
		
		
	}
	
	public boolean fjern(T data)
	{
		boolean removed = false;
		Node<T> previousNode = null;
		Node<T> currNode = head;

		if(currNode != null && currNode.getData() == data)
		{
			head = currNode.getNextNode();
			removed = true;
		}
	
		while(currNode != null && currNode.getData() != data)
		{
			previousNode = currNode;
			currNode = currNode.getNextNode();
		}
		
		if(currNode != null)
		{
			removed = true;
			antall--;
		}
		previousNode.setNextNode(currNode.getNextNode());
	
		
		return removed;
	}
	
	public boolean finn(T data)
	{
		boolean exist = false;
		Node<T> currNode = head;
	
		for(int i = 0; i < antall; i++)
		{
			if(currNode.getData() == data)
			{
				exist = true;
			}
			else
			{
				currNode = currNode.getNextNode();
			}
		}
	
		
		return exist;
	}
	
	
	public void printList()
	{
		Node<T> currNode = head;
		
		System.out.println("Linked List: ");
		
		while(currNode != null)
		{
			System.out.println(currNode.getData() + " ");
			currNode = currNode.getNextNode();
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
			if(curr.getNextNode() != null)
			{
				T data = curr.getData();
				curr = curr.getNextNode();
				return data;
			}
			return null;
		}

		

	}

	
}
