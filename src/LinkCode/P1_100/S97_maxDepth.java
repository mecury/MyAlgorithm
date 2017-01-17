package LinkCode.P1_100;

import LinkCode.Node.TreeNode;

/**
 * Created by 18394 on 2017/1/17.
 */
public class S97_maxDepth {
    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public static int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        } else if (root.left == null && root.right == null){
            return 1;
        }

        int left = maxDepth(root.left);

        int right = maxDepth(root.right);

        return left > right ? left + 1 : right + 1;
    }

    public static void main(String[] args){
        TreeNode o1 = new TreeNode(1), o2 = new TreeNode(2), o3 = new TreeNode(3), o4 = new TreeNode(4),
                o5 = new TreeNode(5), o6 = new TreeNode(6), o7 = new TreeNode(7), o8 = new TreeNode(8),
                o9 = new TreeNode(9), o10 = new TreeNode(10), o11 = new TreeNode(11), o12 = new TreeNode(12);
        o1.left = o2;
        o1.right = o3;
        o2.left = o4;



        System.out.println(maxDepth(o1));
    }
}
