package tree;

public class PostOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.setLeft(new TreeNode(20));
        root.getLeft().setLeft(new TreeNode(40));
        root.getLeft().setRight(new TreeNode(50));
        root.getLeft().getRight().setLeft(new TreeNode(70));
        root.getLeft().getRight().setRight(new TreeNode(80));
        root.setRight(new TreeNode(30));
        root.getRight().setRight(new TreeNode(60));
        postOrder(root);
    }

    public static void postOrder(TreeNode treeNode) {
        if (treeNode != null) {
            postOrder(treeNode.getLeft());
            postOrder(treeNode.getRight());
            System.out.println(treeNode.getValue());
        }
    }
}
