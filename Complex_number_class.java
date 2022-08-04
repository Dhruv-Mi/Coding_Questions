package com.company;

import java.util.Scanner;
 class ComplexNumbers{
    int real;
    int imaginary;

    ComplexNumbers(int r,int i){
        this.real=r;
        this.imaginary=i;
    }
    public void plus(ComplexNumbers c2){
        this.real=this.real+c2.real;
        this.imaginary=this.imaginary+ c2.imaginary;
    }
    public void multiply(ComplexNumbers c2){
        int temp=(this.real* c2.real)-(this.imaginary*c2.imaginary);
        this.imaginary=(this.real*c2.imaginary)+(this.imaginary*c2.real);
        this.real=temp;
    }
    public void print(){
        if(this.real>0&&this.imaginary>0){
            System.out.println(this.real+" + i"+this.imaginary);
        }
        else if(this.real>0&&this.imaginary<0){
            System.out.println(this.real+" - i"+(this.imaginary*-1));
        }
        else{
            System.out.println(this.real+" + i"+this.imaginary);
        }
    }
}

public class Complex_number_class {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int real1 = s.nextInt();
        int imaginary1 = s.nextInt();

        int real2 = s.nextInt();
        int imaginary2 = s.nextInt();

        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

        int choice = s.nextInt();

        if(choice == 1) {
            // Add
            c1.plus(c2);
            c1.print();
        }
        else if(choice == 2) {
            // Multiply
            c1.multiply(c2);
            c1.print();
        }
        else {
            return ;
        }
    }
}
