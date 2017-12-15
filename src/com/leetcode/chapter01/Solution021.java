package com.leetcode.chapter01;

import com.leetcode.utils.ListNode;

public class Solution021 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(-1);
        ListNode ans = ret;
        while(l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                ret.next = l1;
                l1 = l1.next;
                ret = ret.next;
            }
            else {
                ret.next = l2;
                l2 = l2.next;
                ret = ret.next;
            }
        }
        if (l1 != null) ret.next = l1;
        if (l2 != null) ret.next = l2;
        return ans.next;
    }
}

