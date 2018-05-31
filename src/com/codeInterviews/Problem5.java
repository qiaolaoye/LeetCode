package com.codeInterviews;

import java.util.ArrayList;

public class Problem5 {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        if (listNode != null) {
            res.addAll(printListFromTailToHead(listNode.next));
            res.add(listNode.val);
        }
        return res;
    }

//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        ArrayList<Integer> res = new ArrayList<>();
//        Deque<Integer> stack = new ArrayDeque<>();
//
//        while (listNode.next != null) {
//            stack.push(listNode.val);
//            listNode = listNode.next;
//        }
//
//        while (!stack.isEmpty()) {
//            res.add(stack.pop());
//        }
//        return res;
//    }
}
