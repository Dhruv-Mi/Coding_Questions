package com.company;

import java.util.Scanner;

public class add_binary {
    public static String addBinary(String a,String b){
        int len1=a.length()-1;
        int len2=b.length()-1;
        String ans="";
        int carry=0;
        while(len1>=0&&len2>=0){
            if(a.charAt(len1)=='0'&&b.charAt(len2)=='0'&&carry==0){
                ans='0'+ans;
            }
            else if(a.charAt(len1)=='0'&&b.charAt(len2)=='0'&&carry==1){
                carry=0;
                ans='1'+ans;
            }
            else if (a.charAt(len1)=='1'&&b.charAt(len2)=='0'&&carry==0) {
                ans='1'+ans;
            }
            else if(a.charAt(len1)=='1'&&b.charAt(len2)=='0'&&carry==1){
                ans='0'+ans;
            }
            else if(a.charAt(len1)=='0'&&b.charAt(len2)=='1'&&carry==0){
                ans='1'+ans;
            }
            else if(a.charAt(len1)=='0'&&b.charAt(len2)=='1'&&carry==1){
                ans='0'+ans;
            }
            else if(a.charAt(len1)=='1'&&b.charAt(len2)=='1'&&carry==0){
                carry=1;
                ans='0'+ans;
            }
            else if (a.charAt(len1)=='1'&&b.charAt(len2)=='1'&&carry==1) {
                ans='1'+ans;
            }
            System.out.println(ans+" ,Carry: "+carry);
            len1--;
            len2--;
        }
        while(len1>=0){
            if(a.charAt(len1)=='0'&&carry==1){
                carry=0;
                ans='1'+ans;
            }
            else if(a.charAt(len1)=='1'&&carry==0){
                ans='1'+ans;
            }
            else if(a.charAt(len1)=='1'&&carry==1){
                ans='0'+ans;
            }
            else if(a.charAt(len1)=='0'&&carry==0){
                ans='0'+ans;
            }
            System.out.println(ans+" ,Carry: "+carry);
            len1--;
        }
        while(len2>=0){
            if(b.charAt(len2)=='0'&&carry==1){
                carry=0;
                ans='1'+ans;
            }
            else if(b.charAt(len2)=='1'&&carry==0){
                ans='1'+ans;
            }
            else if(b.charAt(len2)=='1'&&carry==1){
                ans='0'+ans;
            }
            else if(b.charAt(len2)=='0'&&carry==0){
                ans='0'+ans;
            }
            System.out.println(ans+" ,Carry: "+carry);
            len2--;
        }
        if(carry==1){
            ans='1'+ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input1= sc.next();
        String input2= sc.next();
        String ans=addBinary(input1,input2);
        System.out.println(ans);
    }
}
