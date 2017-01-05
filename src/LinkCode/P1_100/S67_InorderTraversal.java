package LinkCode.P1_100;

import LinkCode.Node.TreeNode;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by 18394 on 2017/1/3.
 */
public class S67_InorderTraversal {
    /**
     * @param root: The root of binary tree.
     * @return: Inorder in ArrayList which contains node values.
     */
    ArrayList<Integer> result;

    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        inorder(root);
        return result;
    }

    private void inorder(TreeNode root){
        if (root != null){
            inorder(root.left);
            result.add(root.val);
            inorder(root.right);
        }
    }

    //----------------------非递归实现-----------------
    public ArrayList<Integer> inorderTraversal2(TreeNode root) {
        result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()){
                root = stack.pop();
                result.add(root.val);
                root = root.right;
            }
        }
        return result;
    }
}
