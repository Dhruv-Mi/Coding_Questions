package com.company;

import java.util.Scanner;

public class snake_procession {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            String input= sc.next();
            boolean check=false;
            for(int j=0;j<n;j++){
                char ch=input.charAt(j);
                if(ch=='H'&&!check){
                    check = true;
                }
                else if(ch=='T'){
                    if(check) {
                        check = false;
                    }
                    else {
                        check=true;
                        break;
                    }
                }
                else if (ch=='.') {
                    continue;
                }
                else {
                    break;
                }
            }
            if(!check){
                System.out.println("Valid");
            }
            else {
                System.out.println("Invalid");
            }
        }
    }
}
