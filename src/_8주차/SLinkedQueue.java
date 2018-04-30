package _8주차;

public class SLinkedQueue implements Queue {
	private Node head;
	private Node rear;

	public SLinkedQueue() {
		this.head = null;
		this.rear = null;
	}

	public class Node {
		private Object value;
		private Node next;

		public Node() {
			this.value = null;
			this.next = null;
		}

		public Node(Object o) {
			this.value = o;
			this.next = null;
		}

		public Node(Object o, Node next) {
			this.value = o;
			this.next = next;
		}
	}

	@Override
	public void add(Object o) {
		if (empty()) {
			head = rear = new Node(o);
		} else {
			rear.next = new Node(o);
			rear = rear.next;
		}
	}

	@Override
	public Object first() {
		if (empty()) {
			return null;
		} else {
			return head.value;
		}
	}

	@Override
	public Object remove() {
		if (empty()) {
			return null;
		} else {
			Node oldObject = head;
			head = head.next;
			if (head == null) {
				rear = rear.next;
			}
			return oldObject.value;
		}
	}

	@Override
	public int size() {
		int count = 0;
		Node p = head;
		while (p != null) {
			count++;
			p = p.next;
		}
		return count;
	}

	public boolean empty() {
		if (head == null && rear == null) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer("SLInkedQueue : head");
		Node p = head;
		while (p != null) {
			buf.append(" -> " + p.value);
			p = p.next;
		}
		return buf.toString();
	}

}
