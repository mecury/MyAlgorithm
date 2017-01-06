package LinkCode.Node;

/**
 * Created by 18394 on 2017/1/2.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return val + "--->" + next;
    }
}
