package com.codeInterviews;

import java.util.Stack;

public class Problem7 {
    /* 两个栈模拟一个队列 */
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.isEmpty() && stack2.isEmpty()) return Integer.parseInt(null);

        // stack2不为空时直接弹出
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        // stack2为空时，将stack1里的值弹出并压入stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();

    }
}
