package _9주차;

import java.util.*;

public class OrderedTree {
	private Object root;
	private List subtrees;
	private int size;
	private SLinkedQueue queue;

	public OrderedTree() {
		// constructs the empty tree
	}

	public OrderedTree(Object root) {
		// constructs a singleton
		this.root = root;
		subtrees = new LinkedList();// constructs the empty list
		size = 1;
	}

	public OrderedTree(Object root, List trees) {
		this(root);
		for (Iterator it = trees.iterator(); it.hasNext();) {
			Object object = it.next();
			if (object instanceof OrderedTree) {
				OrderedTree tree = (OrderedTree) object;
				subtrees.add(tree);
				size += tree.size();
			}
		}
	}

	public int size() {
		return size;
	}

	public void levelOrder() {
		// 1.큐를 초기화.
		queue = new SLinkedQueue();
		// 2.루트를 큐에 삽입.
		queue.add(this);
		System.out.printf("Level Order :");
		// 3.큐가 공백(null)이 될 때까지 단계 4-6을 반복
		while (queue.first() != null) {
			// 4.큐에서 첫번째 노드 x를 삭제
			OrderedTree temp = (OrderedTree) queue.remove();
			// 5.x를 방문
			System.out.print(" " + temp.root);
			// 6.x의 모든 자식들을 순서대로 큐에 삽입
			for (Iterator<OrderedTree> it = temp.subtrees.iterator(); it.hasNext();) {
				Object object = it.next();
				queue.add(object);
			}
		}
	}

}
