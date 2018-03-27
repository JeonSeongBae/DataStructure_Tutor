package _3주차;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1 = new LinkedList();
		for (int i = 1; i <= 10; i++) {
			list1.insertfirst(i);
		}
		list1.print();
		System.out.println(list1.contain(5));
		System.out.println(list1.contain(20));
		
		LinkedList list2 = new LinkedList();
		for (int i = 1; i <= 10; i++) {
			list2.insertlast(i);
		}
		list2.print();

		System.out.println(list1.contain(5));
		System.out.println(list1.contain(20));

	}

}
