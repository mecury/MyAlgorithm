package LinkCode.P101_200;

import LinkCode.Node.TreeNode;

import java.util.Stack;

/**
 * Created by 18394 on 2017/1/16.
 */
public class S175_InvertBinaryTree {
    /**
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public static void invertBinaryTree(TreeNode root) {
        recursionInvert(root);
    }

    //递归的解法
    public static void recursionInvert(TreeNode root) {
        if (root == null) {
            return;
        }
        recursionInvert(root.left);
        recursionInvert(root.right);

        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
    }


    //非递归的解法
    static Stack<TreeNode> stack = new Stack<>();

    public static void normalInvert(TreeNode root) {
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        first.left = second;
        first.right = three;
        three.left = four;
        System.out.println("pre: " + first);
        invertBinaryTree(first);
        System.out.println("cur " + first);
    }
}
