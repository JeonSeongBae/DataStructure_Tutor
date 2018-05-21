package _07주차;

public class ArrayQueue implements Queue {
	Object[] array;
	int front;
	int rear;

	public ArrayQueue(int size) {
		array = new Object[size];
		this.front = -1;
		this.rear = -1;
	}

	@Override
	public void add(Object o) {
		if (rear == (array.length - 1)) {
			System.out.println("Queue is full");
		} else {
			array[++rear] = o;
		}
	}

	@Override
	public Object first() {
		if (empty()) {
			return null;
		}
		return array[front + 1];
	}

	@Override
	public Object remove() {
		Object oldObject = array[++front];
		array[front] = null;
		return (int) oldObject;
	}

	@Override
	public int size() {
		return rear - front;
	}

	public boolean empty() {
		if (size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer("ArrayQueue : ");
		if (size() != 0) {
			buf.append("[ " + array[0]);
			for (int i = 1; i < array.length; i++) {
				buf.append(" | " + array[i]);
			}
			buf.append(" ]\n");
		}
		buf.append("( front : " + front + ", rear : " + rear + " )");
		return buf.toString();
	}
}
