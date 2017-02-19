package LinkCode.P1_100;

import LinkCode.Node.ListNode;

/**
 * Created by 18394 on 2017/2/19.
 */
public class S35_Reverse {
    /**
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public static ListNode reverse(ListNode head) {
        if (head == null) return head;

        ListNode pre = null, cur = head, next = cur.next;
        while (cur != null){
            cur.next = pre;
            pre = cur;
            cur = next;
            if (next != null){
                next = next.next;
            }
        }

        return pre;
    }

    public static void main(String[] args){
        ListNode n1 = new ListNode(0);
        ListNode n2 = new ListNode(1);
        n1.next = n2;
        reverse(n1);
    }
}
