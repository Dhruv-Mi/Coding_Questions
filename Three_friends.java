package com.company;

import java.util.Scanner;

public class Three_friends {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            int x= sc.nextInt();
            int y= sc.nextInt();
            int z= sc.nextInt();
            int max=Math.max(x,Math.max(y,z));
            if(max==x){
                int ans=max-y-z;
                if(ans==0){
                    System.out.println("yes");
                }
                else {
                    System.out.println("no");
                }
            }
            else if (max==y) {
                int ans=max-x-z;
                if(ans==0){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
            }
            else{
                int ans=max-x-y;
                if(ans==0){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
            }
        }
    }
}
