package LinkCode.P101_200;

import LinkCode.Node.ListNode;

import java.util.ArrayList;

/**
 * Created by 18394 on 2017/2/16.
 */
public class S166_NthToLast {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: Nth to last node of a singly linked list.
     */
    ListNode nthToLast(ListNode head, int n) {
        ListNode node = head;
        int lenght = 0, index = 0;
        while (node != null){
            node = node.next;
            lenght++;
        }
        node = head;
        while (index < lenght - n){
            node = node.next;
            index++;
        }
        return node;
    }
}
