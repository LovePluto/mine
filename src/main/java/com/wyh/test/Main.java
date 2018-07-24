package com.wyh.test;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

public class Main {


    public static void main(String[] args) throws Exception {

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode4.next = listNode5;
        listNode5.next = listNode6;

//        ListNode listNode = mergeTwoLists(listNode1,listNode4);
//        while (listNode != null){
//            System.out.print(listNode.val+" ");
//            listNode = listNode.next;
//        }
        System.out.println(mergeTwoLists(listNode1, listNode4));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] r = new int[2];
                    r[0] = i;
                    r[1] = j;
                    return r;
                }
            }
        }
        return null;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode one = l1;
        ListNode two = l2;
        ListNode head = null;
        ListNode temp = null;
        if (one.val < two.val) {
            head = one;
            one = one.next;
        } else {
            head = two;
            two = two.next;
        }
        temp = head;
        System.out.println("temp=" + temp);
        System.out.println("head=" + temp);
        while (one != null && two != null) {
            if (one.val < two.val) {
                temp.next = one;
                one = one.next;
            } else {
                temp.next = two;
                two = two.next;
            }
            System.out.println("temp1=" + temp);
            System.out.println("head1=" + head);
            temp = temp.next;
        }
        if (one != null) {
            temp.next = one;
        }
        if (two != null) {
            temp.next = two;
        }

        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "val=" + val +
                    ", next=" + next;

        }
    }
}
