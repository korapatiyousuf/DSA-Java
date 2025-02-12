package Problems.BinarySearchTrees;

public class FloorInBST {
    public static int floor(Node root, int key) {
        if(root == null) {
            return -1;
        }

        if(root.data == key) {
            return root.data;
        }

        if(key < root.data) {
            return floor(root.left, key);
        }

        int floorVal = floor(root.right,key);

        return (floorVal <= key && floorVal != -1)? floorVal : root.data;
    }
}
