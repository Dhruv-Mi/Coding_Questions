package com.company;

import java.util.Scanner;

public class Available_capture_for_rook {
    public static int numRookCaptures(char[][] board){
        int i_index=0;
        int j_index=0;
        for(int i=0;i< board.length;i++){
            boolean check=true;
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == 'R'){
                    i_index=i;
                    j_index=j;
                    check=false;
                    break;
                }
            }
            if(!check){
                break;
            }
        }
        int count=0;
        for(int i=i_index+1;i<8;i++){
            char ch=board[i][j_index];
            if(ch=='p'){
                count++;
                break;
            }
            else if(ch=='B'){
                break;
            }
        }
        for(int j=j_index+1;j<8;j++){
            char ch=board[i_index][j];
            if(ch=='p'){
                count++;
                break;
            }
            else if(ch=='B'){
                break;
            }
        }
        for(int i=i_index-1;i>=0;i--){
            char ch=board[i][j_index];
            if(ch=='p'){
                count++;
                break;
            }
            else if(ch=='B'){
                break;
            }
        }
        for(int j=j_index-1;j>=0;j--){
            char ch=board[i_index][j];
            if(ch=='p'){
                count++;
                break;
            }
            else if(ch=='B'){
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[][] board=new char[8][8];
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                board[i][j]=sc.next().charAt(0);
            }
        }
        int ans=numRookCaptures(board);
        System.out.println(ans);
    }
}
