package com.company;

import java.util.Scanner;

public class Find_the_index_of_the_first_occurrence_in_a_string {
    public static int strStr(String haystack,String needle){
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String haystack= sc.next();
        String needle= sc.next();
        int ans=strStr(haystack,needle);
        System.out.println(ans);
    }
}
