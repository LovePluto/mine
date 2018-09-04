package com.wyh.LeetCode;


/**
 * 83. 删除排序链表中的重复元素
 * <p>
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * <p>
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */
public class Main28 {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = cc(head);
        ListNode temp = res;
        ListNode h = head.next;
        int old = head.val;
        while (h != null) {
            if (h.val == old) {
                h = h.next;
            } else {
                temp.next = cc(h);
                temp = temp.next;
                old = h.val;
                h = h.next;
            }
        }
        return res;
    }
    public static ListNode cc(ListNode listNode) {
        ListNode n = new ListNode(listNode.val);
        return n;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}


