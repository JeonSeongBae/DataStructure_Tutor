package _12주차;


public class TestBST {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();

		bst.insert(5);
		bst.insert(10);
		bst.insert(1);
		bst.insert(3);
		bst.insert(7);
		bst.insert(13);
		bst.insert(11);
		bst.insert(15);
		bst.insert(12);

		bst.inorder();

		System.out.println("===============================================");
		bst.delete(1);
		bst.delete(10);
		bst.delete(5);
		bst.delete(7);
		bst.delete(11);
		bst.delete(12);
		bst.delete(13);
		bst.delete(15);
		bst.delete(3);
	}

}
