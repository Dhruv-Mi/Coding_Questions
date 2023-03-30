package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Add_to_array_form_of_integer {
    public static List<Integer> addToArrayForm(int[] num,int k){
        int length= num.length;
        List<Integer> ans=new ArrayList<>();
        int carry=0;
        for(int i=length-1;i>=0;i--){
            int number=num[i];
            int k_value=k%10;
            k=k/10;
            number=number+k_value+carry;
            carry=0;
            if(number>=10){
                carry=1;
                ans.add(number%10);
            }
            else{
                ans.add(number);
            }
        }
        if(carry==1){
            k=k+carry;
        }
        while(k>0){
            ans.add(k%10);
            k=k/10;
        }
        List<Integer> result=new ArrayList<>();
        for(int i=ans.size()-1;i>=0;i--){
            result.add(ans.get(i));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        ArrayList<Integer> ans= (ArrayList<Integer>) addToArrayForm(num,k);
        for (Integer an : ans) {
            System.out.print(an + " ");
        }
    }
}
