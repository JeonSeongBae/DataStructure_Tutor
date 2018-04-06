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

	public void print() {
		Node p = start;
		System.out.print("List : ");
		while (p.getNext() != null) {
			System.out.print(p.getValue() + " ");
			p = p.getNext();
		}
		System.out.println(p.getValue());
	}

	public void reverse() {
		Node p = new Node(start.value, null);
		start = start.next;
		while (start != null) {
			p = new Node(start.value, p);
			start = start.next;
		}
		start = p;
	}

	public void removesecond() {

	}
}