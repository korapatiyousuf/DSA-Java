package Problems.BinarySearchTrees;

public class SearchInBST  {
    public TreeNode searchBST(TreeNode root, int val) {

        if(root != null) {
            if (root.val == val) {
                return root;
            }
            else if (val < root.val) {
                return searchBST(root.left, val);
            }
            else {
                return searchBST(root.right, val);
            }
        }

        return null;
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
