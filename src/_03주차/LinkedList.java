package _03주차;

public class LinkedList {
	Node startNode;

	public LinkedList() {
		this.startNode = null;
	}

	public void insertlast(int x) {
		if (startNode == null) {
			emptyNode(x);
		} else {
			Node p = startNode;
			while (p.getNext() != null) {
				p = p.getNext();
			}
			p.setNext(new Node(x));
		}

	}

	public void insertfirst(int x) {
		if (startNode == null) {
			emptyNode(x);
		} else {
			startNode = new Node(x, startNode);
		}
	}

	private void emptyNode(int x) {
		startNode = new Node(x);
	}

	public boolean contain(int x) {
		if (startNode == null) {
			return false;
		}
		Node p = startNode;
		if (p.getValue() == x) {
			return true;
		}
		while (p.getNext() != null) {
			if (p.getNext().getValue() == x) {
				return true;
			}
			p = p.getNext();
		}
		return false;
	}

	public void print() {
		Node p = startNode;
		System.out.print("List : ");
		while (p.getNext() != null) {
			System.out.print(p.getValue() + " ");
			p = p.getNext();
		}
		System.out.println(p.getValue());
	}
}