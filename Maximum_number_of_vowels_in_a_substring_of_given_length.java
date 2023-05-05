package com.company;

import java.util.Scanner;

public class Maximum_number_of_vowels_in_a_substring_of_given_length {
    public static int maxVowel(String s,int k){
        int ans=Integer.MIN_VALUE;
        int length=s.length();
        int count=0;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        if(ans<count){
            ans=count;
        }
        for(int i=k;i<length;i++){
            int firstChar=s.charAt(i-k);
            int currentChar=s.charAt(i);
            if(firstChar=='a' || firstChar=='e' || firstChar=='i' || firstChar=='o' || firstChar=='u'){
                count=count-1;
            }
            if(currentChar=='a' || currentChar=='e' || currentChar=='i' || currentChar=='o' || currentChar=='u'){
                count=count+1;
            }
            if(ans<count){
                ans=count;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int k= sc.nextInt();
        int ans=maxVowel(s,k);
        System.out.println(ans);
    }
}
