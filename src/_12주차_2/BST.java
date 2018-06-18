package _12주차_2;

import _12주차.BinarySearchTree;

public interface BST {
	public int treesize();
	boolean recu_insert(int key);
	boolean iter_insert(int key);
	public void inorder();
	Comparable<Integer> deleteMinimum(BinarySearchTree T);
}
