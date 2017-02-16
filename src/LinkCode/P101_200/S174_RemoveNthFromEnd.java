package LinkCode.P101_200;

import LinkCode.Node.ListNode;

/**
 * Created by 18394 on 2017/2/16.
 */
public class S174_RemoveNthFromEnd {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: The head of linked list.
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode pre = result, cur = result;
        int length = 0, index = 0;
        while (cur != null) {
            cur = cur.next;
            length++;
        }
        cur = result;
        while(index < length - n){
            pre = cur;
            cur = cur.next;
            index ++;
        }
        pre.next = cur.next;

        cur = result;
        while (cur != null){
            System.out.print(cur.val + "==>");
            cur = cur.next;
        }
        return result.next;
    }

    public static void main(String[] args){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        removeNthFromEnd(n1, 2);
    }
}
