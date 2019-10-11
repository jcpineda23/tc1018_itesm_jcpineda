package mx.itesm.tc1018.trees;

public class BinaryTreeTest {

    int minValue(BinaryTreeNode root) 
    { 
        int minv = root.value; 
        while (root.left != null) 
        { 
            minv = root.left.value; 
            root = root.left; 
        } 
        return minv; 
    } 
	
    
    
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode tmpValue = new BinaryTreeNode(55);
		BinaryTreeNode anotherValue = new BinaryTreeNode(29);
		BinaryTreeNode root = null;
		
		BinaryTree bt = new BinaryTree();
		root = bt.insertNode(root, tmpValue);
		root = bt.insertNode(root, anotherValue);
		root = bt.insertNode(root, new BinaryTreeNode(17));
		root = bt.insertNode(root, new BinaryTreeNode(42));
			
		BinaryTreeNode tmp = root;
		
		while(tmp != null) {
			System.out.println(tmp.value);
			tmp = tmp.left;
		}
		
		
		bt.removeNode(root, 17);
		
		tmp = root;
		while(tmp != null) {
			System.out.println(tmp.value);
			tmp = tmp.left;
		}
		

		
	}

}
