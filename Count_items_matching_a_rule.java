package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Count_items_matching_a_rule {
    public static int countMatches(List<List<String>> items,String ruleKey,String ruleValue){
        int ans=0;
        for (List<String> temp : items) {
            if (Objects.equals(ruleKey, "type") && Objects.equals(ruleValue, temp.get(0))) {
                ans++;
            } else if (Objects.equals(ruleKey, "color") && Objects.equals(ruleValue, temp.get(1))) {
                ans++;
            } else if (Objects.equals(ruleKey, "name") && Objects.equals(ruleValue, temp.get(2))) {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        List<List<String>> items=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<String> temp=new ArrayList<>();
            for(int j=0;j<3;j++){
                String s= sc.next();
                temp.add(s);
            }
            items.add(temp);
        }
        String ruleKey= sc.next();
        String ruleValue= sc.next();
        int ans=countMatches(items,ruleKey,ruleValue);
        System.out.println(ans);
    }
}
