package _12주차_2;

import java.util.*;

public class BinarySearchTree implements BST {
	private Comparable<Object> key;
	private BinarySearchTree left, right; // left,right subtree
	private int size; // 트리의 사이즈를 저장

	public BinarySearchTree() {
		this.size = 0;
	}

	public BinarySearchTree(int key) {
		this.key = new Node(key);
		this.left = null;
		this.right = null;
		this.size = 1;
	}

	// 트리의 크기를 반환
	public int treesize() {
		return size;
	}

	private class Node implements Comparable<Object> {
		int key;

		public Node(int key) {
			this.key = key;
		}

		@Override
		public int compareTo(Object other) {
			int others = (int) other;
			if (key > others) {
				return 1;
			} else if (key < others) {
				return -1;
			} else
				return 0;
		}
	}

	// BST에 key를 값으로 하는 노드를 삽입하는 메소드를 재귀적으로 구현
	public boolean recu_insert(int key) {
		if (this.key == null) {
			this.key = new Node(key);
			this.size = 1;
			return true;
		}
		if (this.key.compareTo(key) == 0) {
			return false;
		} else if (this.key.compareTo(key) > 0) {
			if (this.left == null) {
				this.left = new BinarySearchTree(key);
			} else {
				this.left.recu_insert(key);
			}
		} else if (this.key.compareTo(key) < 0) {
			if (this.right == null) {
				this.right = new BinarySearchTree(key);
			} else {
				this.right.recu_insert(key);
			}
		}
		resize();
		return true;
	}

	public void resize() {
		// size를 left subtree와 right subtree의 크기의 합으로 더해준다.
		this.size = 1;
		if (this.left != null) {
			// left의 키가 없을 경우 자식노드 삭제
			if (this.left.key == null)
				this.left = null;
			else
				this.size += this.left.size;
		}
		if (this.right != null) {
			// right의 키가 없을 경우 자식노드 삭제
			if (this.right.key == null)
				this.right = null;
			else
				this.size += this.right.size;
		}
	}

	// iteration을 사용한 insert 구현
	public boolean iter_insert(int key) {
		// defalut 생성자로 생성되어 key가 없을 경우
		if (this.key == null) {
			this.key = new Node(key);
			this.size = 1;
			return true;
		}

		BinarySearchTree bst = this;

		// size 보정을 위한 Stack
		Stack<BinarySearchTree> stack = new Stack<BinarySearchTree>();

		// 무한 루프와 동일, break or return으로 종료
		while (bst != null) {
			if (bst.key.compareTo(key) == 0) {
				while (!stack.isEmpty()) {
					BinarySearchTree temp = stack.pop();

					// size를 left subtree와 right subtree의 크기의 합으로 더해준다.
					temp.size = 1;
					if (temp.left != null) {
						temp.size += temp.left.size;
					}
					if (temp.right != null) {
						temp.size += temp.right.size;
					}
				}
				return false;
			}

			bst.size++;
			stack.push(bst);
			// 입력 key값이 더 클 경우 (right)
			if (bst.key.compareTo(key) < 0) {
				if (bst.right == null) {
					bst.right = new BinarySearchTree(key);
					break;
				}
				bst = bst.right;
			}
			// 입력 key값이 더 작을 경우 (left)
			else if (bst.key.compareTo(key) > 0) {
				if (bst.left == null) {
					bst.left = new BinarySearchTree(key);
					break;
				}
				bst = bst.left;
			}
		}
		return true;
	}

	public void inorder() {
		// 트리에 아무것도 존재하지 않을 경우
		if (this.size == 0) {
			return;
		}
		if (this.left != null) {
			this.left.inorder();
		}
		Node temp = (Node) this.key;
		System.out.println("Visited : " + temp.key + ", TreeSize : " + treesize());
		if (this.right != null) {
			this.right.inorder();
		}
	}

	public Node delete(int key) {
		// 트리에 아무것도 존재하지 않을 경우
		if (this.size == 0) {
			return null;
		}
		// 자식이 없을 경우 자기 자신만 삭제
		if (this.left == null && this.right == null) {
			this.key = null;
			resize();
		}
		return null;
	}

	@Override
	public Comparable<Integer> deleteMinimum(_12주차.BinarySearchTree T) {
		// TODO Auto-generated method stub
		return null;
	}
}