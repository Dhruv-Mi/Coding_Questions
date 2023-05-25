package com.company;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class Crawler_log_problem {
    public static int minOperations(String[] logs){
        Stack<String> st=new Stack<>();
        for (String temp : logs) {
            if (Objects.equals(temp, "../")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else if (Objects.equals(temp, "./")) {
                continue;
            } else {
                String folder = temp.substring(0, temp.length() - 1);
                st.add(folder);
            }
        }
        return st.size();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String[] logs=new String[n];
        for(int i=0;i<n;i++){
            logs[i]=sc.next();
        }
        int ans=minOperations(logs);
        System.out.println(ans);
    }
}
