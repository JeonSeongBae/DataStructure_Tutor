package _11주차;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree(5);
		tree.recu_insert(5);
		tree.recu_insert(10);

		tree.recu_insert(1);
		tree.recu_insert(3);
		tree.recu_insert(7);
		tree.inorder();
	}
}