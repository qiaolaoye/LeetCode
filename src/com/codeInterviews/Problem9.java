package com.codeInterviews;

public class Problem9 {
    public int Fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int n0 = 0;
        int n1 = 1;
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = n1 + n0;
            n0 = n1;
            n1 = res;
        }

        return res;
    }

}
