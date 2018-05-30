package com.leetcode.chapter05;

import com.leetcode.utils.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution234 {
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        Deque<Integer> stack = new LinkedList<>();
        stack.push(head.val);

        // find the middle element
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            stack.push(slow.val);
        }

        if (fast.next == null) stack.pop();
        while (slow.next != null) {
            slow = slow.next;
            int tmp = stack.pop();
            if (tmp != slow.val) return false;
        }

        return true;
    }

    public static boolean isPalindrome_(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode p = slow.next;
        slow.next = null;

        ListNode q;
        while (p != null) {
            q = p;
            p = p.next;
            q.next = slow;
            slow = q;
        }

        while (slow.next != null) {
            if (head.val != slow.val) return false;
            slow = slow.next;
            head = head.next;
        }
        return true;
    }
}
