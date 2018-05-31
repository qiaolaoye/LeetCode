package com.codeInterviews;

import java.util.Stack;

public class Problem7 {
    /* ����ջģ��һ������ */
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.isEmpty() && stack2.isEmpty()) return Integer.parseInt(null);

        // stack2��Ϊ��ʱֱ�ӵ���
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        // stack2Ϊ��ʱ����stack1���ֵ������ѹ��stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();

    }
}
