package tree;

public class InOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.setLeft(new TreeNode(20));
        root.getLeft().setLeft(new TreeNode(40));
        root.getLeft().setRight(new TreeNode(50));
        root.getLeft().getRight().setLeft(new TreeNode(70));
        root.getLeft().getRight().setRight(new TreeNode(80));
        root.setRight(new TreeNode(30));
        root.getRight().setRight(new TreeNode(60));
        inOrder(root);
    }

    public static void inOrder(TreeNode treeNode) {
        if (treeNode != null) {
            inOrder(treeNode.getLeft());
            System.out.println(treeNode.getValue());
            inOrder(treeNode.getRight());
        }
    }

}
