package _3주차;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedlist = new LinkedList();
		for (int i = 1; i <= 10; i++) {
			linkedlist.insertfirst(i);
		}

		linkedlist.print();
		System.out.println(linkedlist.contain(5));
		System.out.println(linkedlist.contain(20));

		for (int i = 1; i <= 10; i++) {
			linkedlist.insertlast(i);
			System.out.println(i);
		}
		linkedlist.print();

	}

}
