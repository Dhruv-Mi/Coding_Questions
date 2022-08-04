package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int S = sc.nextInt(); // start point of Fahrenheit
        int E = sc.nextInt(); // end point of Fahrenheit
        int W = sc.nextInt();// jump or gap
        int c;
        while (S<=E) {
            c = 5 * (S-32)/9;
            System.out.print(S);
            System.out.print(" ");
            System.out.println(c);
            S=S+W;
        }
    }
}
