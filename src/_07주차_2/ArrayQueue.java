package _07주차_2;

public class ArrayQueue implements Queue {
	private Object[] a;
	private int front, rear;

	public ArrayQueue(int capacity) {
		a = new Object[capacity];
		this.front = -1;
		this.rear = -1;
	}

	@Override
	public void add(Object object) {// 주어진 원소를 큐의 뒤에 삽입
		if (rear >= a.length - 1) {
			System.out.println("Queue is Full");
		} else {
			rear++;
			a[rear] = object;
		}
	}

	@Override
	public Object first() {
		return a[front + 1];
	}

	@Override
	public Object remove() {
		if (front == rear) {
			throw new java.util.NoSuchElementException();
		} else {
			Object temp = a[front + 1];
			a[front + 1] = null;
			front++;
			return temp;
		}
	}

	@Override
	public int size() {
		return rear - front;
	}

	public String toString() {
		if (front == rear)
			throw new java.util.NoSuchElementException();
		StringBuffer buf = new StringBuffer("Array Queue = [ " + a[0]);
		for (int i = 1; i <= rear; i++) {
			buf.append(" | " + a[i]);
		}
		buf.append(" ] (front :" + front + " , rear :" + rear + ")");
		return buf.toString();

	}

	public boolean empty() {
		if (rear - front == 0)
			return true;
		return false;
	}

}