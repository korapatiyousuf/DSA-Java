package Problems.BinarySearchTrees;

public class MinElementBST {
    int minValue(Node root) {
        // code here
        int minNodeValue = findMinNode(root, Integer.MAX_VALUE);
        return (minNodeValue == Integer.MAX_VALUE)? 0 : minNodeValue;
    }

    int findMinNode(Node root, int currMin) {
        if(root != null) {
            if(root.data < currMin) {
                currMin = root.data;
            }

            if(root.left != null) {
                currMin = findMinNode(root.left, currMin);
            }
            else {
                currMin = findMinNode(root.right, currMin);
            }
        }
        return currMin;
    }

    public class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
}
