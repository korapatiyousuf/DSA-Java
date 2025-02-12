package Problems.BinarySearchTrees;

//Leetcode-230 - Kth Smallest Element in a BST
//URL: https://leetcode.com/problems/kth-smallest-element-in-a-bst/

public class KthElement {
    int pos = 0;
    public int kthSmallest(TreeNode root, int k) {
        TreeNode node = inorder(root, k);
        return (node == null) ? -1 : node.val;
    }

    public TreeNode inorder(TreeNode root, int k) {
        if(root == null) {
            return root;
        }

        TreeNode left = inorder(root.left, k);
        if(left != null) {
            return left;
        }

        pos++;
        if(k == pos) {
            return root;
        }
        return inorder(root.right, k);
    }
}
