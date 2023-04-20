package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Find_winner_on_a_tic_tac_toe_game {
    public static String ticTacToe(int[][] moves){
        String[][] temp=new String[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                temp[i][j]=".";
            }
        }
        for(int i=0;i< moves.length;i++){
            if(i%2==0){
                temp[moves[i][0]][moves[i][1]]="X";
            }
            else{
                temp[moves[i][0]][moves[i][1]]="O";
            }
        }
        String s = ticTacToeHelper(temp);
        if(Objects.equals(s, "X")){
            return "A";
        }
        else if(Objects.equals(s, "O")){
            return "B";
        }
        else{
            if(moves.length==9){
                return "Draw";
            }
            else {
                return s;
            }
        }
    }
    public static String ticTacToeHelper(String[][] table){
        for(int i=0;i<3;i++){
            String check=table[i][0];
            boolean ch=true;
            if(!Objects.equals(check, ".")) {
                for (int j = 1; j < 3; j++) {
                    if (!Objects.equals(table[i][j], check)) {
                        ch = false;
                        break;
                    }
                }
                if (ch) {
                    return check;
                }
            }
        }
        for(int j=0;j<3;j++){
            String check=table[0][j];
            boolean ch=true;
            if(!Objects.equals(check,".")){
                for(int i=1;i<3;i++){
                    if(!Objects.equals(table[i][j],check)){
                        ch=false;
                        break;
                    }
                }
                if(ch){
                    return check;
                }
            }
        }
        if((table[0][0]=="X" && table[1][1]=="X" && table[2][2]=="X")||(table[0][2]=="X" && table[1][1]=="X" && table[2][0]=="X")){
            return "X";
        }
        if((table[0][0]=="O" && table[1][1]=="O" && table[2][2]=="O")||(table[0][2]=="O" && table[1][1]=="O" && table[2][0]=="O")){
            return "O";
        }

        return "Pending";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] moves=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                moves[i][j]= sc.nextInt();
            }
        }
        String ans=ticTacToe(moves);
        System.out.println(ans);
    }
}
