package com.leetcode.chapter01;

import com.leetcode.utils.ListNode;

public class Solution019 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head;

        while (n != 0) {
            fast = fast.next;
            n--;
        }
        if (fast == null) return head.next;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}
