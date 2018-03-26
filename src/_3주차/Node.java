package _3주차;

public class Node {
	int value;
	Node next;

	public Node() {
		this.value = -1;
		this.next = null;
	}

	public Node(int x, Node p) {
		this.value = x;
		this.next = p;
	}
}
