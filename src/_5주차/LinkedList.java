package _5주차;

public class LinkedList {
	private Node start;

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

	public LinkedList() {
		this.start = null;
	}

	public void insertlast(int x) {
		if (start == null) {
			start = new Node(x);
		} else {
			Node p = start;
			while (p.getNext() != null) {
				p = p.getNext();
			}
			p.setNext(new Node(x));
		}
	}

	public void insertfirst(int x) {
		if (start == null) {
			start = new Node(x);
		} else {
			start = new Node(x, start);
		}
	}

	@Override
	public String toString() {
		Node p = start;
		System.out.print("List : ");
		while (p.getNext() != null) {
			System.out.print(p.getValue() + " ");
			p = p.getNext();
		}
		return String.valueOf(p.getValue());
	}

	public void reverse() {
		if (start == null) {
			throw new IllegalArgumentException("start == null");
		}
		Node p = start;
		start = start.next;
		Node q = start.next;
		p.next = null;
		while (q != null) {
			start.next = p;
			p = start;
			start = q;
			q = start.next;
		}
		start.next = p;
	}

	public Node removesecond() {
		if (start == null) {
			throw new IllegalArgumentException("start == null");
		}
		if (start.next == null) {
			throw new IllegalArgumentException("start.next == null");
		}
		Node p = start.getNext();
		start.setNext(start.getNext().getNext());
		return p;
	}

	public void reverse_out() {
		if (start == null) {
			throw new IllegalArgumentException("start == null");
		}
		Node p = null;
		while (start != null) {
			p = new Node(start.getValue(), p);
			start = start.getNext();
		}
		start = p;
	}
}