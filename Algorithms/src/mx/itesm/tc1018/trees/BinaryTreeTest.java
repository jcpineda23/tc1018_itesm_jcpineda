package mx.itesm.tc1018.trees;

public class BinaryTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode tmpValue = new BinaryTreeNode(12);
		BinaryTreeNode anotherValue = new BinaryTreeNode(7);
		BinaryTreeNode root = null;
		
		BinaryTree bt = new BinaryTree();
		root = bt.insertNode(root, tmpValue);
		bt.insertNode(root, anotherValue);
		
		System.out.println(root.value);
		System.out.println(root.left.value);

		
		
	}

}
