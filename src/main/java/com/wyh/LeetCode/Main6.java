package com.wyh.LeetCode;

/**
 * 24. 两两交换链表中的节点
 * <p>
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * <p>
 * 示例:
 * <p>
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 * <p>
 * 说明:
 * <p>
 * 你的算法只能使用常数的额外空间。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * <p>
 * 这个需要自己画草图，明白链表指针变化过后的指向关系
 */
public class Main6 {
    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        System.out.println(listNode);
        System.out.println(swapPairs(listNode));
    }

    /**
     * 1.需要判断链表长度为 null 或者长度为 1，直接返回
     * 2.需要把 head 指向新的链表的头结点
     * 3.判断 current 当前节点，下一个节点，下下一个节点是否为空，这关系到下一轮的逻辑处理
     * 4.temp 指向两个交换节点的前一个节点
     * current 指向两个交换节点其中的前一个节点
     * next 指向两个交换节点其中的后一个节点
     * 5.进行交换，重复步骤3
     *
     * @param head
     * @return
     */
    public static ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode next = head.next;
        ListNode temp = head;
        head = next;
        current.next = next.next;
        next.next = current;
        while (current != null && current.next != null && current.next.next != null) {
            temp = current;
            next = current.next.next;
            current = current.next;
            current.next = next.next;
            next.next = current;
            temp.next = next;
        }
        return head;
    }


    //  Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

}
