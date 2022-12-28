package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Valid_sudoku {
    public static boolean isValidSudoku(char[][] board){
        for(int i=0;i<9;i++){
            HashMap<Character,Integer> map=new HashMap<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(map.containsKey(board[i][j])){
                        return false;
                    }
                    else{
                        map.put(board[i][j],1);
                    }
                }
            }
        }
        for(int i=0;i<9;i++){
            HashMap<Character,Integer> map=new HashMap<>();
            for(int j=0;j<9;j++){
                if(board[j][i]!='.'){
                    if(map.containsKey(board[j][i])){
                        return false;
                    }
                    else{
                        map.put(board[j][i],1);
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[][] input=new char[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                input[i][j]= sc.next().charAt(0);
            }
        }
        boolean ans=isValidSudoku(input);
        System.out.println(ans);
    }
}
