package _11주차;

import java.util.Stack;

public class BinarySearchTree implements BST {
	private Comparable<Object> key;
	private BinarySearchTree left, right; // left,right subtree
	private int size;// 트리의 사이즈를 저장

	private class Node implements Comparable {
		int key;

		public Node(Object key) {
			this.key = (int) key;
		}

		@Override
		public int compareTo(Object o) {
			if (this.key < (int) o) {
				return -1;
			} else if (this.key > (int) o) {
				return 1;
			} else {
				// this.key == (int) o
				return 0;
			}
		}
	}

	public BinarySearchTree() {
		this.key = null;
		this.left = this.right = null;
		this.size = 0;
	}

	public BinarySearchTree(Object key) {
		this.key = new Node(key);
		this.left = this.right = null;
		this.size = 1;
	}

	@Override
	public int treesize() {
		return this.size;
	}

	@Override
	public boolean recu_insert(Object key) {
		if (this.key == null) {
			this.key = new Node(key);
			this.size = 1;
			return true;
		}
		int result = this.key.compareTo(key);
		if (result == 0) {
			return false;
		}

		if (result < 0) {
			if (this.right == null) {
				this.right = new BinarySearchTree(key);
			} else {
				this.right.recu_insert(key);
			}
		} else if (result > 0) {
			if (this.left == null) {
				this.left = new BinarySearchTree(key);
			} else {
				this.left.recu_insert(key);
			}
		}
		this.size = 1;
		if (this.left != null) {
			this.size += this.left.size;
		}
		if (this.right != null) {
			this.size += this.right.size;
		}
		return true;
	}

	@Override
	public boolean iter_insert(Object key) {
		if (this.key == null) {
			this.key = new Node(key);
			this.size = 1;
			return true;
		}
		BinarySearchTree temp = this;
		Stack<BinarySearchTree> stack = new Stack<BinarySearchTree>();
		while (temp != null) {
			if (temp.key.compareTo(key) < 0) {
				temp.size++;
				if (temp.right == null) {
					temp.right = new BinarySearchTree(key);
					break;
				}
				stack.push(temp);
				temp = temp.right;
			} else if (temp.key.compareTo(key) > 0) {
				temp.size++;
				if (temp.left == null) {
					temp.left = new BinarySearchTree(key);
					break;
				}
				stack.push(temp);
				temp = temp.left;
			} else if (temp.key.compareTo(key) == 0) {
				while (!stack.isEmpty()) {
					stack.pop().size--;
				}
				return false;
			}
		}
		return true;
	}

	@Override
	public void inorder() {
		if (this.left != null) {
			this.left.inorder();
		}
		Node temp = (Node) this.key;
		System.out.println("Visited : " + temp.key + ", TreeSize : " + treesize());
		if (this.right != null) {
			this.right.inorder();
		}
	}
}