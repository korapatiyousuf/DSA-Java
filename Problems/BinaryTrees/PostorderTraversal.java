package Problems.BinaryTrees;

import java.util.ArrayList;
import java.util.List;

//Leetcode 145. Binary Tree Postorder Traversal

public class PostorderTraversal {
    List<Integer> postOrderList = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            postOrderList.add(root.val);
        }
        return postOrderList;
    }

    public static void main(String[] args) {
    }

    class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

    }
}
