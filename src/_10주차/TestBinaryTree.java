package _10주차;

public class TestBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree(9);
		BinaryTree tree2 = new BinaryTree(9, 30);
		System.out.println("tree1");
		tree.levelOrder();
		System.out.print("pre Order :");
		tree.preorder(0);
		System.out.println("tree2");
		tree2.levelOrder();
		System.out.print("pre Order :");
		tree2.preorder(0);
	}
}