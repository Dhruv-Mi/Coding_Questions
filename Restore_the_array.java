package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Restore_the_array {
        public static int dfs(String s, long k, int i, int[] dp) {
            if (i == s.length()) return 1;
            if (s.charAt(i) == '0') return 0;
            if (dp[i] != -1) return dp[i];

            int ans = 0;
            long num = 0;
            for (int j = i; j < s.length(); j++) {
                num = num * 10 + s.charAt(j) - '0';
                if (num > k) break;
                ans = (ans + dfs(s, k, j + 1, dp)) % 1000000007;
            }
            return dp[i] = ans;
        }

        public static int numberOfArrays(String s, int k) {
            int[] dp = new int[s.length()];
            Arrays.fill(dp, -1);
            return dfs(s, k, 0, dp);
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int k= sc.nextInt();
        int ans=numberOfArrays(s,k);
        System.out.println(ans);
    }
}
