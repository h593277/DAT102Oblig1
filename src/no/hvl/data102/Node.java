package no.hvl.data102;

public class Node<T> {

	public T data;
	public Node nextNode;
	
	public Node(T element)
	{
		data = element;
		nextNode = null;
	}
}
