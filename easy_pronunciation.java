package com.company;

import java.util.Scanner;

public class easy_pronunciation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int trial= sc.nextInt();
        for(int j=0;j<trial;j++) {
            int n = sc.nextInt();
            String input = sc.next();
            int count = 0;
            for (int i = 0; i < n; i++) {
                char ch = input.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count = 0;
                } else {
                    count++;
                    if (count >= 4) {
                        break;
                    }
                }
            }
            if(count>=4){
                System.out.println("no");
            }
            else {
                System.out.println("yes");
            }
        }
    }
}
