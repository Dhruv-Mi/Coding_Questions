package com.company;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Occurrences_after_bigram {
    public static String[] findOccurrences(String text,String first,String second){
        String[] temp=text.split(" ");
        ArrayList<String> arr=new ArrayList<>();
        for(int i=2;i< temp.length;i++){
            if(Objects.equals(temp[i - 2], first) && Objects.equals(temp[i - 1], second)){
                arr.add(temp[i]);
            }
        }
        String[] ans=new String[arr.size()];
        for(int i=0;i< arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text= sc.nextLine();
        String first= sc.next();
        String second=sc.next();
        String[] ans=findOccurrences(text,first,second);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
