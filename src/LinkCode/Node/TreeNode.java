package LinkCode.Node;

/**
 * Created by 18394 on 2017/1/3.
 */
public class TreeNode {
    public int val;
    public TreeNode left, right;
    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return val + "-->" ;
    }
}
