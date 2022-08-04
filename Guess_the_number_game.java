package com.company;
import java.util.Random;
import java.util.Scanner;

class guess_the_number{
    public int computer_number,user_number;
    public int total_guess;

    public void setUser_number(int num){
        user_number=num;
    }
    guess_the_number(){
        Random r=new Random();
        computer_number=r.nextInt(100);
    }
    public boolean check(){
        total_guess +=1;
       if(computer_number==user_number){
           System.out.println("Congratulations!!, You found the number in "+total_guess+" guesses");
           return true;
       }
       else if(computer_number>user_number){
           System.out.println("~~~The number you chose is smaller than computer number, Try a bigger number~~~");
           return false;
       }
       else if(computer_number<user_number) {
           System.out.println("~~~The number you chose is greater than computer number, Try a smaller number~~~");
           return false;
       }
       else{
           System.out.println("!!!You chose the number out of bound!!!");
       }
       return false;
    }
}

public class Guess_the_number_game {
    public static void main(String[] args) {
        System.out.println("***Welcome to guessing the number game***");
        boolean b=false;
        guess_the_number g=new guess_the_number();
        Scanner sc=new Scanner(System.in);
        while(!b){
            System.out.print("Enter the Number: ");
            int value= sc.nextInt();
            g.setUser_number(value);
            b=g.check();
        }
    }
}
