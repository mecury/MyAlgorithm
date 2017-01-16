package LinkCode.P101_200;

import LinkCode.Node.ListNode;
import LinkCode.Node.TreeNode;

import java.util.List;

/**
 * Created by 18394 on 2017/1/16.
 */
public class S173_insertionSortList {
    /**
     * @param head: The first node of linked list.
     * @return: The head of linked list.
     */
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode curr = head.next;
        ListNode pre = head;

        while(curr != null){
            if (curr.val >= pre.val){
                pre  = curr;
                curr = curr.next;
            } else if (curr.val < pre.val){
                pre.next = curr.next;
                ListNode pNode = dummyHead ;
                ListNode qNode = dummyHead.next;
                while(qNode != null){
                    if (qNode.val > curr.val){
                        pNode.next = curr;
                        curr.next = qNode;
                        break;
                    }
                    pNode = qNode;
                    qNode = qNode.next;
                }
                curr = pre.next;
            }
        }

        return dummyHead.next;
    }
}
