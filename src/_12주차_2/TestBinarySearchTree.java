package _12주차_2;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		System.out.println("recu");
		BinarySearchTree tree = new BinarySearchTree();
		tree.recu_insert(5);
		tree.recu_insert(10);
		tree.recu_insert(10);
		tree.recu_insert(10);
		tree.recu_insert(10);
		tree.recu_insert(1);
		tree.recu_insert(3);
		tree.recu_insert(3);
		tree.recu_insert(3);
		tree.recu_insert(3);
		tree.recu_insert(7);
		tree.inorder();

		System.out.println("iter");
		BinarySearchTree tree2 = new BinarySearchTree(13);
		tree2.iter_insert(13);
		tree2.iter_insert(13);
		tree2.iter_insert(13);
		tree2.iter_insert(11);
		tree2.iter_insert(11);
		tree2.iter_insert(11);
		tree2.iter_insert(11);
		tree2.iter_insert(11);
		tree2.iter_insert(15);
		tree2.iter_insert(12);
		tree2.inorder();
	}
}