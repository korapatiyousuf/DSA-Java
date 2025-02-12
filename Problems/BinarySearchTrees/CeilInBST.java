package Problems.BinarySearchTrees;

//Ceil in BST - gfg - Medium

public class CeilInBST {
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        //code here
        // Base case
        if (root == null) {
            return -1;
        }

        // We found equal key
        if (root.data == key) {
            return root.data;
        }

        // If root's key is smaller,
        // ceil must be in the right subtree
        if (root.data < key) {
            return findCeil(root.right, key);
        }

        // Else, either left subtree or root
        // has the ceil value
        int ceil = findCeil(root.left, key);

        return (ceil >= key) ? ceil : root.data;
    }
}

