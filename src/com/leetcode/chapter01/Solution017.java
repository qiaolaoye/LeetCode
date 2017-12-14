package com.leetcode.chapter01;

import java.util.LinkedList;
import java.util.List;

public class Solution017 {
    public static List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<>();
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        if (digits.length() == 0) return ans;
        ans.add("");

        for (int i = 0; i < digits.length(); i++) {
            int x = Character.getNumericValue(digits.charAt(i));
            while (ans.peek().length() == i) {
                String t = ans.remove();
                for (Character s : mapping[x].toCharArray())
                    ans.add(t + s);
            }
        }
        return ans;
    }
}
