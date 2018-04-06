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
		} else {
			Node p = null;
			while (start.next != null) {
				p = new Node(start.value, p);
				start = start.next;
			}
			start = new Node(start.value, p);
		}
	}

	public Node removesecond() {
		if (start == null) {
			throw new IllegalArgumentException("start == null");
		} else if (start.next == null) {
			throw new IllegalArgumentException("start.next == null");
		} else {
			Node p = start.next;
			start.next = start.next.next;
			return p;
		}
	}

	public void reverse_out() {
		Node p = start;
	}
}