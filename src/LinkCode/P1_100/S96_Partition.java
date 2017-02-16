package LinkCode.P1_100;

import LinkCode.Node.ListNode;

/**
 * Created by 18394 on 2017/2/14.
 */
public class S96_Partition {
    /**
     * @param head: The first node of linked list.
     * @param x:    an integer
     * @return: a ListNode
     */
    public static ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ListNode newHead = new ListNode(Integer.MIN_VALUE);
        newHead.next = head;
        ListNode insertPre = newHead;
        //求到大于x的前一个位置
        while (insertPre.next.val < x) {
            insertPre = insertPre.next;
            if (insertPre.next == null) {
                return head;
            }
        }
        ListNode pre = insertPre.next, cur = insertPre.next;
        while (cur != null) {
            if (cur.val >= x) {
                pre = cur;
                cur = cur.next;
            } else { //当cur小于x时
                ListNode insertPreNext = insertPre.next;
                insertPre.next = cur;
                insertPre = insertPre.next;
                pre.next = cur.next;
                cur.next = insertPreNext;
                cur = pre.next;
            }
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(3),
                n2 = new ListNode(3),
                n3 = new ListNode(1),
                n4 = new ListNode(2),
                n5 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListNode node = partition(n1, 5);

        while (node != null) {
            System.out.print(node.val + "==>");
            node = node.next;
        }
    }
}
