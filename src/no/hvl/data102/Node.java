package no.hvl.data102;

public class Node<T> {

	private T data;
	private Node<T> nextNode;
	
	public Node(T element)
	{
		data = element;
		nextNode = null;
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
}
