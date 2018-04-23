package _7주차_2;

public class SLinkedQueue implements Queue {
	private Node head;
	private Node rear;
	private int size;

	public SLinkedQueue() {
		this.head = null;
		this.rear = null;
		this.size = 0;
	}

	public String toString() {
		if (head == rear)
			throw new java.util.NoSuchElementException();
		StringBuffer buf = new StringBuffer("Singly Linked Queue = head");
		Node p = head;
		while (p != null) {
			buf.append(" -> " + p.object);
			p = p.next;
		}
		return buf.toString();

	}

	public ArrayQueue toArrayQueue() {
		ArrayQueue aq = new ArrayQueue(size);
		Node p = head;
		for (int i = 0; i < size; i++) {
			aq.add(p.object);
			p = p.next;
		}
		return aq;
	}

	public boolean empty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	@Override
	public void add(Object object) {
		// TODO Auto-generated method stub
		if (empty()) {
			head = rear = new Node(object);
		} else {
			rear.next = new Node(object);
			rear = rear.next;
		}
		++size;
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		if (size == 0)
			throw new IllegalStateException("the queue is empty");
		return head.object;
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		if (size == 0)
			throw new IllegalStateException("the queue is empty");
		Node temp = head;
		head = head.next;
		--size;
		return temp;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	private class Node {
		Object object;
		Node next;

		Node(Object object) {
			this.object = object;
		}

		Node(Object object, Node next) {
			this.object = object;
			this.next = next;
		}
	}
}