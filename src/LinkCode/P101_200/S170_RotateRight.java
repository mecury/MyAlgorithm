package LinkCode.P101_200;

import LinkCode.Node.ListNode;

/**
 * Created by 18394 on 2017/2/17.
 */
public class S170_RotateRight {
    /**
     * @param head: the List
     * @param k:    rotate to the right k places
     * @return: the list after rotation
     */
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;
        //先端点，在连接端点
        int length = 0;
        ListNode pre = head, cur = head;
        //得到链表的长度
        while (cur != null) {
            pre = cur;
            cur = cur.next;
            length++;
        }
        //k存在大于length的长度
        k = k % length;

        //断开链表
        pre = cur = head;
        int n = 0;
        while (n < length - k) {
            pre = cur;
            cur = cur.next;
            n++;
        }

        ListNode realNode = head;
        if (pre.next != null) {
            pre.next = null; //断开节点指向null
            realNode = cur;
            while (cur != null) {
                pre = cur;
                cur = cur.next;
            }
            pre.next = head;
        }

//        ListNode node = realNode;
//        while (node != null) {
//            System.out.print(node.val + "-->");
//            node = node.next;
//        }

        return realNode;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1),
                n2 = new ListNode(2),
                n3 = new ListNode(3),
                n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        rotateRight(n1, 7);
    }
}
