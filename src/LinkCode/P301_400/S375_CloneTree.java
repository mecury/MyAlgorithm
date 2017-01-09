package LinkCode.P301_400;

import LinkCode.Node.TreeNode;

/**
 * Created by 18394 on 2017/1/9.
 */
public class S375_CloneTree {
    /**
     * @param root: The root of binary tree
     * @return root of new tree
     */
    TreeNode mNode;

    public TreeNode cloneTree(TreeNode root) {
        if (root == null) return null;
        mNode = new TreeNode(root.val);
        TreeNode resultNode = mNode;
        traversalCreate(root);
        return resultNode;
    }

    private void traversalCreate(TreeNode node) {
        if (node == null) return;
        TreeNode leftNode, rightNode, tempNode = mNode;
        if (node.left != null) {
            leftNode = new TreeNode(node.left.val);
            mNode.left = leftNode;
            mNode = leftNode;
            traversalCreate(node.left);
        }
        if (node.right != null) {
            mNode = tempNode;
            rightNode = new TreeNode(node.right.val);
            mNode.right = rightNode;
            mNode = rightNode;
            traversalCreate(node.right);
        }
    }
}
