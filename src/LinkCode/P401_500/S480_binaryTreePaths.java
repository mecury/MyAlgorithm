package LinkCode.P401_500;

import LinkCode.Node.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 18394 on 2017/1/6.
 * 给一棵二叉树，找出从根节点到叶子节点的所有路径
 */
public class S480_binaryTreePaths {
    /**
     * @param root the root of the binary tree
     * @return all root-to-leaf paths
     */
    public static List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list = new ArrayList<>();
        String str = "";
        findPath(root, list, str);
        return list;
    }

    private static void findPath(TreeNode root, ArrayList<String> list, String path) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            if (path.equals("")) {
                path += root.val;
            }else{
                path += "->" + root.val;
            }
            list.add(path);
        }
        if (path.equals("")){
            path += root.val;
        }else {
            path += "->" + root.val;
        }
        findPath(root.left, list, path);
        findPath(root.right, list, path);
    }

    public static void main(String[] args) {
        TreeNode first = new TreeNode(1), second = new TreeNode(2), three = new TreeNode(3), five = new TreeNode(5);
        first.left = second;
        first.right = three;
        second.right = five;
        ArrayList<String> list = (ArrayList<String>) binaryTreePaths(first);

        for (String str : list) {
            System.out.println(str);
        }
    }
}
