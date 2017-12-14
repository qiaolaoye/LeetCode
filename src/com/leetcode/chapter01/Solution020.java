package com.leetcode.chapter01;

import java.util.Stack;

public class Solution020 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ']') {
                if (stack.empty()) return false;
                if (stack.peek() != '[') return false;
                stack.pop();
                continue;
            }
            if (ch == '}') {
                if (stack.empty()) return false;
                if (stack.peek() != '{') return false;
                stack.pop();
                continue;
            }
            if (ch == ')') {
                if (stack.empty()) return false;
                if (stack.peek() != '(') return false;
                stack.pop();
                continue;
            }
            else stack.push(ch);
        }
        if (!stack.empty()) return false;
        return true;
    }
}
