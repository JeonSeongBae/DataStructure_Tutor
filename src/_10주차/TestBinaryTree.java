package _10주차;

public class TestBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree(9);
		BinaryTree tree2 = new BinaryTree(9, 30);
		tree.levelOrder();
		System.out.print("pre Order :");
		tree.preorder(0);
	}
}