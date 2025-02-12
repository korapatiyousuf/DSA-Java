package Problems.BinarySearchTrees;

//Leetcode 450 - Delete node in BST
//URL: https://leetcode.com/problems/delete-node-in-a-bst/

public class DeleteBSTNodeSuccessor {
    public TreeNode deleteNode(TreeNode root, int key) {
        //base case
        if(root == null) {
            return root;
        }

        //1. find the node with the key value whether it is left or right of the root node or root itself
        if(key < root.val) {
            root.left = deleteNode(root.left, key);
        }
        else if(key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        else {      //key is the root value

            //Now, we have 3 scenarios

            //1. key node has no children - Leaf node
            if(root.left == null && root.right == null) {
                return null;
            }

            //2. key node has 1 child
            if(root.left == null || root.right == null) {
                return (root.left == null) ? root.right : root.left;
            }
            //3. key node has 2 children
            if(root.left != null && root.right != null) {
                //find largest node val in the left subtree of the root node
                TreeNode successorNode = findSuccessorRootNode(root.right);
                root.val = successorNode.val;
                root.right = deleteNode(root.right, successorNode.val);
            }
        }
        return root;
    }

    public TreeNode findSuccessorRootNode(TreeNode root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }
}
