package LinkCode;

import LinkCode.Node.ListNode;

/**
 * Created by 18394 on 2017/1/2.
 * 删除链表中等于给定值val的所有节点。
 */
public class S452_RemoveElements {
    /**
     * @param head a ListNode
     * @param val  an integer
     * @return a ListNode
     */
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        while (head.val == val) {
            if (head.next == null) return null;
            head = head.next;
        }
        ListNode current = head.next;
        ListNode previous = head;
        while (current!= null) {
            if (current.val == val) {
                previous.next = current.next;
                current = current.next;
            }else{
                previous = current;
                current = current.next;
            }
        }
        return head;
    }
}
