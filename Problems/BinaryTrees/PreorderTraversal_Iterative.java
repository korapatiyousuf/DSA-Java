package Problems.BinaryTrees;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

//Leetcode 144. Binary Tree Preorder Traversal
//Iterative Approach
public class PreorderTraversal_Iterative {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorderList = new ArrayList<>();
        if(root == null) {
            return preorderList;
        }
        Stack<TreeNode> nodeStack = new Stack<>();
        nodeStack.push(root);
        while(!nodeStack.empty()) {
            TreeNode currNode = nodeStack.pop();
            preorderList.add(currNode.val);

            if(currNode.right != null) {
                nodeStack.push(currNode.right);
            }

            if(currNode.left != null) {
                nodeStack.push(currNode.left);
            }
        }

        return preorderList;
    }
}