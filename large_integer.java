package com.company;

import java.util.Scanner;

public class large_integer {
    public static int[] plusOne(int[] digits){
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            carry = sum / 10;
            digits[i] = sum % 10;
        }

        if (carry > 0) {
            int[] sum = new int[digits.length + 1];
            sum[0] = carry;
            System.arraycopy(digits, 0, sum, 1, sum.length - 1);
            return sum;
        } else
            return digits;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        int[] ans=plusOne(input);
        for(int i=0;i< ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
