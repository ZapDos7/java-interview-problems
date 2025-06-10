package dataStructures.trees;

public class TreeComparison {
    public static void main(String[] args) {
        // setup
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(30));

        // method
        if (isSameTree(p, q)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }

    // Two binary trees are considered the same if
    // they are structurally identical,
    // and the nodes have the same value
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        } // structural difference

        if (p == null && q == null) {
            return true;
        }

        if (p.val != q.val) {
            return false;
        } // value difference

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }


    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}