package LinkCode;

/**
 * Created by 18394 on 2017/1/2.
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return val + "--->" + next;
    }
}
