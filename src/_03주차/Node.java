package _03주차;

public class Node {
	private int value;
	private Node next;

	public Node() {
		this.value = -1;
		this.next = null;
	}

	public Node(int x) {
		this.value = x;
		this.next = null;
	}

	public Node(int x, Node p) {
		this.value = x;
		this.next = p;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
