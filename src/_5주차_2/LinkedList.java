package _5주차_2;

public class LinkedList {
	private Node top;
	private int size;

	public boolean isEmpty() {
		return (size == 0);
	}

	public int peek() {
		if (size == 0)
			throw new java.util.NoSuchElementException();
		return top.value;
	}

	public void push(int v) {
		top = new Node(v, top);
		++size;
		System.out.println("Push : " + v);
	}

	public Node pop() { // Node로 반환
		if (size == 0)
			throw new java.util.NoSuchElementException();
		Node oldTop = top;
		top = top.next;
		--size;
		return oldTop;
	}

	public int size() {
		return this.size;
	}

	public Node removesecond() {
		if (size == 0 || size == 1)
			throw new java.util.NoSuchElementException();
		Node x = top.next;
		top.next = top.next.next;
		--size;
		System.out.println("Removed Node : " + x.value);
		return x;
	}

	public void reverse() {
		if (size == 0)
			throw new java.util.NoSuchElementException();
		Node newlist = null; // 역순저장할 새 노드
		Node p = top; // 본래 스택을 가리킬 노드
		Node q = null;
		while (p != null) {
			q = p.next; //
			p.next = newlist;
			newlist = p;
			p = q;
		}
		top = newlist;
	}

	public String toString() {
		if (size == 0)
			throw new java.util.NoSuchElementException();
		StringBuffer buf = new StringBuffer("Current Elements of Stack : top -> " + Integer.toString(top.value));
		Node p = top.next;
		while (p != null) {
			buf.append(" -> " + p.value);
			// buf.insert(0, Integer.toString(p.value));
			p = p.next;
		}
		return buf.toString();
	}

	public void print() {
		System.out.print("Current Elements of Stack : top");
		for (Node p = top; p != null; p = p.next) {
			System.out.print(" -> " + p.value);
		}
		System.out.println();
	}
}