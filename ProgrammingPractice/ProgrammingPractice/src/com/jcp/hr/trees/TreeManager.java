package com.jcp.hr.trees;

public class TreeManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode n = new TreeNode(3);
		n.left = new TreeNode(9);
		
		TreeNode n2 = new TreeNode(20);
		n.right = n2;
		
		n2.left = new TreeNode(15);
		n2.right = new TreeNode(7);
		
		Solution s = new Solution();
		System.out.println(s.maxDepth(n));
		
		
	}


}



// Definition for a binary tree node.
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

class Solution {
    public int maxDepth(TreeNode root) {
        int leftHeight = 0;
        int rightHeight = 0;
        
        if(root == null)
            return 0;        
        
        if(root.left == null && root.right == null){
            return 1;
        }
                
        if(root.left != null){
            leftHeight = maxDepth(root.left);
        }
        if(root.right != null){
            rightHeight = maxDepth(root.right);
        }
         
        //Verify which is higher
        if (rightHeight >= leftHeight) 
            return 1 + rightHeight;  // account for root
        else if (leftHeight > rightHeight) 
            return 1 + leftHeight;     // account for root
        
       return 0; 
    }

}