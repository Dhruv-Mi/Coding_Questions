package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Total_salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int salary =sc.nextInt();
        char grade=sc.next().charAt(0);
        double hra= salary*0.20;
        double da=salary*0.50;
        int allow;
        if(grade=='A'){
            allow=1700;
        }
        else if(grade=='B'){
            allow=1500;
        }
        else{
            allow=1300;
        }
        double pf=salary*0.11;
        double totalsalary=salary+hra+da+allow-pf;
        double p= Math.round(totalsalary);
        int sal=(int)p;
        System.out.println(sal);
    }
}
