package _11주차;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree(5);
		tree.recu_insert(3);
		tree.recu_insert(7);
		tree.inorder();
		System.out.println("iter");
		tree.iter_insert(13);
		tree.iter_insert(11);
		tree.iter_insert(15);
		tree.iter_insert(12);
		tree.inorder();
	}
}