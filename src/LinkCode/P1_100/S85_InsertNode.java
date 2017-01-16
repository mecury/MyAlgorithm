package LinkCode.P1_100;

import LinkCode.Node.TreeNode;

/**
 * Created by 18394 on 2017/1/16.
 */
public class S85_InsertNode {
    /**
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        if (root == null) return node;
        TreeNode dummy = root;
        realInsertNode(root, node);
        return root;
    }

    public void realInsertNode(TreeNode root, TreeNode node) {
        if (root == null) {
            return;
        }
        if (node.val >= root.val) {
            if (root.right == null) {
                root.right = node;
                return;
            } else {
                realInsertNode(root.right, node);
            }
        } else if (node.val < root.val) {
            if (root.left == null){
                root.left = node;
                return;
            }
            realInsertNode(root.left, node);
        }
    }
}
