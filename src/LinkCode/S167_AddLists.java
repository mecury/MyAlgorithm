package LinkCode;

import LinkCode.Node.ListNode;

/**
 * Created by 18394 on 2017/1/2.
 * 你有两个用链表代表的整数，其中每个节点包含一个数字。
 * 数字存储按照在原来整数中相反的顺序，使得第一个数字位于链表的开头。
 * 写出一个函数将两个整数相加，用链表形式返回和。
 */
public class S167_AddLists {
    /**
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2
     */
    public static ListNode addLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(1);
        ListNode head = result;
        ListNode currentOne = l1;
        ListNode currentTwo = l2;
        int sum = 0;
        while (currentOne != null || currentTwo != null) {
            if (currentOne == null) {
                //l1的链表中的元素相加完成后
                sum += currentTwo.val;
                if (sum > 9) {
                    result.val = sum - 10;
                    sum = 1;
                } else {
                    result.val = sum;
                    sum = 0;
                }
                currentTwo = currentTwo.next;
                //当下一个元素为null时，不在创建result中用于存储ListNode的节点
                if (currentTwo != null) {
                    result.next = new ListNode(0);
                    result = result.next;
                }
                continue;
            } else if (currentTwo == null) {
                //l2的链表中的元素相加完成后
                sum += currentOne.val;
                if (sum > 9) {
                    result.val = sum - 10;
                    sum = 1;
                } else {
                    result.val = sum;
                    sum = 0;
                }
                currentOne = currentOne.next;
                if (currentOne != null) {
                    result.next = new ListNode(0);
                    result = result.next;
                }
                continue;
            }

            sum = currentOne.val + currentTwo.val + sum;
            if (sum > 9) {
                sum = sum - 10;
                result.val = sum;
                sum = 1;
            } else {
                result.val = sum;
                sum = 0;
            }
            currentOne = currentOne.next;
            currentTwo = currentTwo.next;
            //两个链表同时为null时，不在创建新的节点来存储数据
            if (currentOne == null && currentTwo == null) {

            } else {
                result.next = new ListNode(1);
                result = result.next;
            }
        }

        if (sum == 1) {
            result.next = new ListNode(1);
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode first = new ListNode(3);
        ListNode two = new ListNode(1);
        ListNode three = new ListNode(5);
        first.next = two;
        two.next = three;
        three.next = null;
        System.out.println(first);

        ListNode f = new ListNode(5);
        ListNode t = new ListNode(9);
        ListNode lt = new ListNode(2);
        f.next = t;
        t.next = lt;
        lt.next = null;
        System.out.println(f);

        System.out.println(addLists(first, f));
    }
}
