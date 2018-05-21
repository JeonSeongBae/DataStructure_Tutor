package _05주차;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		// LinkedStack의 객체a를 생성하고 정수 1, 2, 3, 4, 5를 삽입하시오
		for (int i = 0; i < 5; i++) {
			a.insertfirst(i);
		}
		// a를 프린트하시오.
		System.out.println(a);
		// remove_second( )를 수행한 후 a를 프린트하시오.
		a.removesecond();
		System.out.println(a);
 
		a.reverse();
		System.out.println(a);

		a.reverse_out();
		System.out.println(a);
	}

}
