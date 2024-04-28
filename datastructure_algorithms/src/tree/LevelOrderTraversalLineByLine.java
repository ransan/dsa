package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalLineByLine {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.setLeft(new TreeNode(20));
        root.getLeft().setLeft(new TreeNode(40));
        root.getLeft().setRight(new TreeNode(50));
        root.setRight(new TreeNode(30));
        root.getRight().setRight(new TreeNode(70));
        root.getRight().getRight().setRight(new TreeNode(80));
        levelOrderTraversal(root);
    }

    public static void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                System.out.print(curr.getValue() + " ");
                if (curr.getLeft() != null) {
                    queue.add(curr.getLeft());
                }
                if (curr.getRight() != null) {
                    queue.add(curr.getRight());
                }
            }
            System.out.println();
        }
    }
}
