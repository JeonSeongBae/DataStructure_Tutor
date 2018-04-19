package _7주차;

public class TestQueue {

	public static void main(String[] args) {
		/* ArrayQueue */
		ArrayQueue aq = new ArrayQueue(10);
		for (int i = 1; i < 6; i++) {
			aq.add(i);
		}
		System.out.println(aq);
		for (int i = 0; i < 2; i++) {
			aq.remove();
		}
		System.out.println(aq);
		
		/* SLinkedQueue */
		SLinkedQueue slq = new SLinkedQueue();
		for (int i = 6; i < 10; i++) {
			slq.add(i);
		}
		System.out.println(slq);
		for (int i = 0; i < 4; i++) {
			slq.remove();
		}
		System.out.println(slq);
		for (int i = 10; i < 13; i++) {
			slq.add(i);
		}
		System.out.println(slq);
		System.out.println(slq.toArrayQueue());
	}

}
