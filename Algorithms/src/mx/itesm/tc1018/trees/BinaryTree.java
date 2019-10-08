package mx.itesm.tc1018.trees;

public class BinaryTree {
	
	BinaryTreeNode root;
	
	public BinaryTreeNode insertNode(BinaryTreeNode root, BinaryTreeNode node) {
		if(root == null) {
			root = node;
			//return root;
		}
		else {
			/// If the value to be inserted is smaller 
			/// it will be inserted in the left sub-tree
			if(node.value < root.value) {
				///Go left
				root.left = insertNode( root.left,node);
			}
			/// If the value to be inserted is larger 
			/// it will be inserted in the right sub-tree
			else if(node.value > root.value) {
				//// Go right
				root.right = insertNode( root.right,node);
			}
		}
		return root;
	}
	
	

}
