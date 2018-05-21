package _06주차;

public class ArrayQueue implements Queue {
	Object queue[];// queue에 사용할 배열
	int size;// queue에 저장된 원소의 갯수
	int queueSize = 4;// queue의 초기 크기

	public ArrayQueue(int queueSize) {// 생성자
		// queue 초기화
		this.queue = new Object[queueSize];
		this.queueSize = queueSize;
	}

	@Override
	public void add(Object object) {
		// TODO Auto-generated method stub
		// 내부 코드 구현
		if (size == queue.length) {
			System.out.print("Queue is Full!");
			resize();
		}
		size++;
		queue[(size - 1)] = object;
		System.out.print("ADD       " + queue[size - 1] + " |");
		print();
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		// 내부 코드 구현
		if (size == 0) {
			System.out.println("Queue is Empty");
		} else {
			System.out.print("FIRST     " + queue[0] + " |");
			print();
		}
		return queue[0];
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		// 내부 코드 구현
		Object remove = queue[0];
		if (size == 0) {
			System.out.println("Queue is Empty");
		} else {
			System.out.print("REMOVE    " + queue[0] + " |");
			Object[] a = queue;
			queue = new Object[queue.length];
			System.arraycopy(a, 1, queue, 0, size);
			size--;
			print();
		}
		return remove;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		// 내부 코드 구현
		int i = 0;
		while (queue[i] != null) {
			i++;
			if (i == queue.length) {
				break;
			}
		}
		return i;
	}

	@Override
	public String toString() {
		// 내부 코드 구현
		if (size == 0)
			throw new IllegalArgumentException("Empty Queue!");
		StringBuffer buf = new StringBuffer("* Array Queue = ");
		if (queue[0] != null)
			buf.append("[" + queue[0]);
		for (int i = 1; i < size; i++) {
			buf.append("|" + queue[i]);
			i++;
		}
		buf.append("]");
		return buf.toString();
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		System.out.println(" RESIZE");
		Object[] a = queue;
		queue = new Object[queue.length * 2];
		System.arraycopy(a, 0, queue, 0, size);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}
}