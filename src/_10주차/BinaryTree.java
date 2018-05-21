package _10주차;

import java.util.*;

public class BinaryTree {
	private int[] tree;
	private int size;

	public BinaryTree(int a, int seed) {
		this.tree = new int[a];
		Random r = new Random(seed);
		for (int i = 0; i < a; i++) {
			tree[i] = r.nextInt(100);
		}
		this.size = a;
	}

	public BinaryTree(int a) {
		this.tree = new int[a];
		for (int i = 0; i < a; i++) {
			tree[i] = i;
		}
		this.size = a;
	}

	public int size() {
		return this.size;
	}

	public void levelOrder() {
		System.out.print("level Order :");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + tree[i]);
		}
		System.out.println();
	}

	// 인덱스 i를 root로 하는 서브트리에서 수행할 것
	public void preorder(int i) {
		// 1.루트를 방문한다.
		// 2.각 서브트리를 순서대로 전위순회한다.
		if (i >= size) {
			return;
		}
		System.out.print(" " + tree[i]);
		preorder(2 * i + 1);
		preorder(2 * i + 2);
	}
}