package _6주차;

public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestQueue mTestQueue = new TestQueue();
		mTestQueue.testArrayQueue();
	}

	private void testArrayQueue() {
		// TODO Auto-generated method stub
		Queue mArrayQueue = new ArrayQueue(4);
		System.out.println("********** Test ArrayQueue **********");
		mArrayQueue.add("DE");
		mArrayQueue.add("PA");
		mArrayQueue.add("NJ");
		System.out.println(mArrayQueue);
		mArrayQueue.remove();
		mArrayQueue.remove();
		mArrayQueue.remove();
		mArrayQueue.remove();
		System.out.println(mArrayQueue);
		mArrayQueue.add("GA");
		mArrayQueue.add("CT");
		mArrayQueue.add("MA");
		mArrayQueue.add("MD");
		mArrayQueue.add("AB");
		System.out.println(mArrayQueue);
		mArrayQueue.remove();
	}

}
