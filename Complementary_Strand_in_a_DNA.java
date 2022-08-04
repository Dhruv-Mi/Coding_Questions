package com.company;

import java.util.Scanner;

public class Complementary_Strand_in_a_DNA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            String input=sc.next();
            StringBuilder output= new StringBuilder();
            for(int j=0;j<input.length();j++){
                if(input.charAt(j)=='A'){
                    output.append('T');
                }
                else if(input.charAt(j)=='T'){
                    output.append('A');
                }
                else if(input.charAt(j)=='C'){
                    output.append('G');
                }
                else{
                    output.append('C');
                }
            }
            System.out.println(output);
        }
    }
}
