package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Unique_email_address {
    public static int numUniqueEmails(String[] emails){
        ArrayList<String> ans=new ArrayList<>();
        for (String s : emails) {
            String[] temp = s.split("@");
            String local = temp[0];
            StringBuilder check = new StringBuilder();
            for (int j = 0; j < temp[0].length(); j++) {
                char ch = local.charAt(j);
                if (ch != '.' && ch != '+') {
                    check.append(ch);
                }
                if (ch == '+') {
                    break;
                }
            }
            check.append('@').append(temp[1]);
            if (!ans.contains(check.toString()) && check.charAt(0)!='@') {
                ans.add(check.toString());
            }
        }
        return ans.size();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String[] emails=new String[n];
        for(int i=0;i<n;i++){
            emails[i]= sc.next();
        }
        int ans=numUniqueEmails(emails);
        System.out.println(ans);
    }
}
