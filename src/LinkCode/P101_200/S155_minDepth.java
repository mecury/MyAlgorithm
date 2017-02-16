package LinkCode.P101_200;

import LinkCode.Node.TreeNode;

/**
 * Created by 18394 on 2017/2/14.
 */
public class S155_minDepth {

    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        } else if (root.left == null && root.right == null){
            return 1;
        } else if (root.left != null && root.right == null){
            return minDepth(root.left) + 1;
        } else if (root.left == null && root.right != null){
            return minDepth(root.right) + 1;
        } else {
            int left_min = minDepth(root.left);
            int right_min = minDepth(root.right);
            return (left_min < right_min ? left_min : right_min) + 1;
        }
    }
}
