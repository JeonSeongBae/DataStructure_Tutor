package _11주차;

public class BinarySearchTree implements BST {
	private Comparable key;
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
		if (this.key.compareTo(key) == 0) {
			return false;
		}
		if (this.key.compareTo(key) < 0) {
			if (this.right == null) {
				this.right = new BinarySearchTree(key);
			} else {
				this.right.recu_insert(key);
			}
		} else if (this.key.compareTo(key) > 0) {
			if (this.left == null) {
				this.left = new BinarySearchTree(key);
			} else {
				this.left.recu_insert(key);
			}
		}
		return true;
	}

	@Override
	public boolean iter_insert(Object key) {
		return false;
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