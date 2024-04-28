package tree;

public class PrintNodesAtKDistance {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.setLeft(new TreeNode(20));
        root.getLeft().setLeft(new TreeNode(40));
        root.getLeft().setRight(new TreeNode(50));
        root.setRight(new TreeNode(30));
        root.getRight().setRight(new TreeNode(70));
        root.getRight().getRight().setRight(new TreeNode(80));
        printNodesatKDistance(root, 2);
    }

    public static void printNodesatKDistance(TreeNode root, int distance) {
        if (root == null) {
            return;
        }
        if (distance == 0) {
            System.out.println(root.getValue());
        } else {
            printNodesatKDistance(root.getLeft(), distance - 1);
            printNodesatKDistance(root.getRight(), distance - 1);
        }
    }
}
