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
	
	public BinaryTreeNode removeNode(BinaryTreeNode root, int key) {
		
		if(root == null) {
			return root;
		}
		
		///Else go down the tree
		
		if(key > root.value) {
			root.right = removeNode(root.right, key);
		}
		else if(key < root.value) {
			root.left = removeNode(root.left, key);
		}
		
		 // if key is same as root value, then THIS IS THE NODE 
		 // WE ARE TRYING TO DELEVE
        else
        { 
            // node with only one child or no child 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
  
            
            root.value = minValue(root.right); 
  
            
            root.right = removeNode(root.right, root.value); 
        } 
		
		
		
		
	    return root;	
	}
	
	public void printInOrder(BinaryTreeNode root) {
		
	}
	
	
	
	public int minValue(BinaryTreeNode root) {
		
		while(root.left != null) {
			root = root.left;
		}
		
		return root.value;
		
	}
	
	
	
    

}
