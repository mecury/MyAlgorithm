package LinkCode.P401_500;

import LinkCode.Node.TreeNode;

/**
 * Created by 18394 on 2017/1/12.
 */
public class S469_IsIdentical {
    /**
     * @param a, b, the root of binary trees.
     * @return true if they are identical, or false.
     */
    public static boolean isIdentical = true;

    public static  boolean isIdentical(TreeNode a, TreeNode b) {
        isIdenticalRequsion(a, b);
        return isIdentical;
    }

    private static void isIdenticalRequsion(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return;
        } else if (a == null || b == null) {
            isIdentical = false;
            return;
        }

        if (a.val != b.val) {
            isIdentical = false;
            return;
        }
        isIdentical(a.left, b.left);
        isIdentical(a.right, b.right);
    }

    public static void main(String[] args){
        TreeNode first = new TreeNode(1);
        first.left = new TreeNode(2);
        first.right = new TreeNode(3);
        TreeNode firstO = new TreeNode(1);
        firstO.left = new TreeNode(2);
        firstO.right = new TreeNode(3);
        System.out.println(isIdentical(first, firstO));
    }
}
