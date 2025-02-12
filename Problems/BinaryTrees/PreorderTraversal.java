package Problems.BinaryTrees;

import java.util.List;
import java.util.ArrayList;

//Leetcode 144. Binary Tree Preorder Traversal
public class PreorderTraversal {
    List<Integer> preOrderList = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root != null) {
            preOrderList.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        return preOrderList;
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