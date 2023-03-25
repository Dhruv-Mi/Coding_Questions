package com.company;

import java.util.Scanner;

public class Fair_candy_swap {
    public static int[] fairCandySwap(int[] alice,int[] bob){
        int m= alice.length;
        int n= bob.length;
        int[] ans=new int[2];
        int required_candy=(arraySum(alice)+arraySum(bob))/2;
        int alice_sum=arraySum(alice);
        int bob_sum=arraySum(bob);
        for(int i=0;i<m;i++){
            int alice_candy=alice[i];
            for(int j=0;j<n;j++){
                int bob_candy=bob[j];
                alice[i]=bob_candy;
                bob[j]= alice_candy;
                if(alice_sum-alice_candy+bob_candy==required_candy && bob_sum-bob_candy+alice_candy==required_candy){
                    ans[0]=alice_candy;
                    ans[1]=bob_candy;
                    return ans;
                }
                else{
                    alice[i]=alice_candy;
                    bob[j]=bob_candy;
                }
            }
        }
        return ans;
    }

    public static int arraySum(int[] arr){
        int sum=0;
        for (int j : arr) {
            sum = sum + j;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[] alice=new int[m];
        int[] bob=new int[n];
        for(int i=0;i<m;i++){
            alice[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            bob[i]= sc.nextInt();
        }
        int[] ans=fairCandySwap(alice,bob);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
