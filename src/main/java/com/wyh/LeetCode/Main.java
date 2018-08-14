package com.wyh.LeetCode;

/**
 * 2018.07.31
 * 1. 两数之和
 * <p>
 * 题目来源：https://leetcode-cn.com/problems/add-two-numbers/description/
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * [9]
 * [1,9,9,]
 * 9+991=1000;
 * <p>
 * 这道题最初是用 int 计算，溢出
 * 修改成用 long 计算，继续溢出
 * 修改成用 int[] 数组计算
 * 数组一个单位计算，忘记进位问题
 * 进位顺序出错
 * 最后结题思路来源于某大佬的提醒
 */
public class Main {


    public static void main(String[] args) {

        ListNode listNode = new ListNode(2);
        listNode.next = new ListNode(4);
        listNode.next.next = new ListNode(3);

        System.out.print(listNode);
        ListNode listNode1 = new ListNode(5);
        listNode1.next = new ListNode(6);
        listNode1.next.next = new ListNode(4);
        System.out.println(listNode1);
        ListNode listNode2 = addTwoNumbers(listNode, listNode1);
        System.out.print(listNode2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode listNode1 = listNode;
        int temp = 0;
        while (l1 != null && l2 != null) {
            listNode1.next = new ListNode((temp + l1.val + l2.val) % 10);
            temp = (temp + l1.val + l2.val) / 10;
            listNode1 = listNode1.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            listNode1.next = new ListNode((temp + l1.val) % 10);
            temp = (temp + l1.val) / 10;
            listNode1 = listNode1.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            listNode1.next = new ListNode((temp + l2.val) % 10);
            temp = (temp + l2.val) / 10;
            listNode1 = listNode1.next;
            l2 = l2.next;
        }
        if (temp != 0) {
            listNode1.next = new ListNode(1);
        }
        return listNode.next;
    }

    public static int getLength(ListNode listNode) {
        int count = 0;
        while (listNode != null) {
            count++;
            listNode = listNode.next;
        }
        return count;
    }

    public static int[] getNums(ListNode listNode, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = listNode.val;
            listNode = listNode.next;
        }
        int tag = nums.length / 2;
        int length = nums.length - 1;
        int temp = 0;
        for (int i = 0; i < tag; i++) {
            temp = nums[i];
            nums[i] = nums[length - i];
            nums[length - i] = temp;
        }
        return nums;
    }


    public static void print(int[] nums) {
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }


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
