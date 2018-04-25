package _7주차_2;

public class TestQueue {

	public static void main(String[] args) {
		ArrayQueue aq = new ArrayQueue(5);
		for (int i = 1; i <= 5; i++) {
			aq.add(i);
		}
		System.out.println(aq.toString());
		aq.remove();
		aq.remove();
		aq.remove();
		System.out.println(aq.toString());

		SLinkedQueue sq = new SLinkedQueue();
		for (int j = 6; j < 10; j++) {
			sq.add(j);
		}
		for (int j = 0; j < 8; j++) {
			sq.remove();
		}
		System.out.println(sq.toString());
		for (int j = 10; j < 13; j++) {
			sq.add(j);
		}
		System.out.println(sq.toString());
		System.out.println(sq.toArrayQueue());
	}
}