package com.leetcode.chapter05;

import com.leetcode.utils.ListNode;

public class Solution206 {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = head.next;
        head.next = null;
        ListNode q;

        while (p != null) {
            q = p;
            p = p.next;
            q.next = head;
            head = q;
        }

        return head;
    }

    public static ListNode reverseList_(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList_(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}


