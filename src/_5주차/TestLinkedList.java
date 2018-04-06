package _5주차;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		for (int i = 0; i < 10; i++) {
			list.insertfirst(i);
		}
		list.print();
		list.reverse();
		list.print();
		list.removesecond();
	}

}
