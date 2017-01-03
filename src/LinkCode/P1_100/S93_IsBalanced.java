package LinkCode.P1_100;

import LinkCode.Node.TreeNode;


public class S93_IsBalanced {
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
        if (root == null) return true;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return (Math.abs(left - right) < 2) && isBalanced(root.left) && isBalanced(root.right);
    }

    public int getHeight(TreeNode root) {
        if (root == null) return 0;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
}
