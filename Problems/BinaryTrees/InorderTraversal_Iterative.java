package Problems.BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Leetcode 94. Binary Tree Inorder Traversal
public class InorderTraversal_Iterative {
    List<Integer> inorderList = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> nodeStack = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !nodeStack.empty()) {
            while(curr != null) {
                nodeStack.push(curr);
                curr = curr.left;
            }
            curr = nodeStack.pop();
            inorderList.add(curr.val);
            curr = curr.right;
        }
        return inorderList;
    }
}
