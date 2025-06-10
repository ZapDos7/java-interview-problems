package dataStructures.trees;

public class SubTreeChecker {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(2);

        if (isSubtree(p, q)) {
            System.out.println("Subtree!");
        } else {
            System.out.println("Not a subtree");
        }
    }

    private static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return subRoot == null;
        }
        if (TreeComparison.isSameTree(root, subRoot)) {
            return true;
        } else {
            return TreeComparison.isSameTree(root.left, subRoot) || TreeComparison.isSameTree(root.right, subRoot);
        }
    }
}
