package tree;

public class HeightOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.setLeft(new TreeNode(8));
        root.setRight(new TreeNode(30));
        root.getRight().setLeft(new TreeNode(40));
        root.getLeft().setRight(new TreeNode(50));
        System.out.println(getHeight(root));
    }

    public static int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.getLeft()), getHeight(root.getRight())) +1;
    }
}
