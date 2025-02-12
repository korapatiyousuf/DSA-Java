package Problems.BinaryTrees;

import java.util.List;
import java.util.ArrayList;

//Leetcode 94. Binary Tree Inorder Traversal
public class InorderTraversal {
    List<Integer> inorderList = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root != null) {
            inorderTraversal(root.left);
            inorderList.add(root.val);
            inorderTraversal(root.right);
        }
        return inorderList;
    }

    public class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;
        public TreeNode() {}
        public TreeNode(int val) {
            this.val = val;
        }
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
