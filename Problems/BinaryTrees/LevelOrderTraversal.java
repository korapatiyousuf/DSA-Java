package Problems.BinaryTrees;

import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

import Problems.BinaryTrees.TreeNode;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrderList= new ArrayList<>();
        if(root == null) {
            return levelOrderList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int levelSize= queue.size();
            List<Integer> levelList = new ArrayList<>();
            for(int i=0;i<levelSize;i++) {
                TreeNode currNode = queue.poll();
                levelList.add(currNode.val);
                if(currNode.left != null) {
                    queue.offer(currNode.left);
                }

                if(currNode.right != null) {
                    queue.offer(currNode.right);
                }
            }
            levelOrderList.add(levelList);
        }
        return levelOrderList;
    }
}