package com.leetcode.chapter04;

import com.leetcode.utils.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution160 {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        /**
         * You can prove that: say A length = a + c, B length = b + c, after switching pointer, pointer A will move another b + c steps,
         * pointer B will move a + c more steps, since a + c + b + c = b + c + a + c, it does not matter what value c is.
         * Pointer A and B must meet after a + c + b (b + c + a) steps. If c == 0, they meet at NULL.
         */
        // if a & b have different length, then we will stop the loop after second iteration
        while (a != b) {
            // for the end of first iteration, we just reset the pointer to the head of another linkedlist.
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }

    public static ListNode getIntersectionNode_(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode l1 = headA;
        ListNode l2 = headB;

        while (l1 != null) {
            set.add(l1);
            l1 = l1.next;
        }
        while (l2 != null) {
            if (set.contains(l2)) return l2;
            else l2 = l2.next;
        }
        return null;
    }

    public static ListNode getIntersectionNode__(ListNode headA, ListNode headB) {
        int lengthA = getLength(headA), lengthB = getLength(headB);
        ListNode a = headA, b = headB;

        // move to the same start point
        while (lengthA > lengthB) {
            a = a.next;
            lengthA--;
        }
        while (lengthB > lengthA) {
            b = b.next;
            lengthB--;
        }

        while (a != b) {
            a = a.next;
            b = b.next;
        }
        return a;
    }

    private static int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }
        return length;
    }

}
