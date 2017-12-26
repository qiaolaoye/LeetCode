package com.leetcode.chapter04;

import java.util.Stack;

public class Solution155 {
//    public static void main(String[] args) {
//        MinStack ms = new MinStack();
//        ms.push(512);
//        ms.push(-1024);
//        ms.push(-1024);
//        ms.push(512);
//        ms.pop();
//        System.out.println(ms.getMin());
//        ms.pop();
//        System.out.println(ms.getMin());
//        ms.pop();
//        System.out.println(ms.getMin());
//    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
class MinStack {

    /** initialize your data structure here. */
    private Stack<Integer> stack; // store all element.
    private Stack<Integer> stackMin; // update the minimum value.

    public MinStack() {
        stack = new Stack<>();
        stackMin = new Stack<>();
    }

    public void push(int x) {
        if (stack.empty() || x <= stackMin.peek()) { // case '=': same value of element.
            stackMin.push(x);
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.peek().equals(stackMin.peek())) {
            stackMin.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stackMin.peek();
    }
}


