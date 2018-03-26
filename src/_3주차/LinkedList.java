package _3주차;

public class LinkedList {
	Node start;

	public LinkedList() {
		this.start = null;
	}

	public void insertlast(int x) {
		if (start == null) {
			start = new Node(x, null);
		} else {
			Node p = start;
			while (p.next != null) {
				p = p.next;
			}
			p.next = new Node(x, null);
		}

	}

	public void insertfirst(int x) {
		if (start == null) {
			start = new Node(x, null);
		} else {
			Node p = start;
			start = new Node(x, p);
		}
	}

	public boolean contain(int x) {
		if (start == null) {
			return false;
		}
		Node p = start;
		if (p.value == x) {
			return true;
		}
		while (p.next != null) {
			if (p.next.value == x) {
				return true;
			}
			p = p.next;
		}
		return false;
	}

	public void print() {
		Node p = start;
		System.out.print("List : ");
		while (p.next != null) {
			System.out.print(p.value + " ");
			p = p.next;
		}
		System.out.println(p.value);
	}
}