package _7주차_2;

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
		// TODO Auto-generated method stub
		if (rear >= a.length-1) {

		} else {
			rear++;
			a[rear] = object;
		}
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return a[front + 1];
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
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
		else
			return false;
	}

}