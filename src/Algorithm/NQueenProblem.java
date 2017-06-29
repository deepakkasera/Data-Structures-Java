package Algorithm;

import java.util.Scanner;

/**
 * Created by deepak on 29/6/17.
 */
public class NQueenProblem {

    static boolean isSafeToPlace(int board[][],int n,int i,int j){

        // Check for Column
        for(int x = 0; x < n; x++){
            if (board[x][j] == 1){
                return false;
            }
        }

        //Check for top left diagonal
        int x = i;
        int y = j;
        while(x >= 0 && y >= 0){
            if(board[x][y] == 1){
                return false;
            }
            x--;
            y--;
        }

        //Check for top right diagonal
        x = i;
        y = j;
        while(x >= 0 && y < n){
            if(board[x][y] == 1){
                return false;
            }
            x--;
            y++;
        }

        return true;
    }

    static boolean solveNQueen(int board[][],int i,int n){
        if(i == n){
            //Print Board
            for(int x = 0; x < n; x++){
                for(int y = 0; y < n; y++){
                    if(board[x][y] == 1){
                        System.out.print("Q ");
                    }
                    else{
                        System.out.print("X ");
                    }
                }
                System.out.println();
            }
            return true;
        }

        for(int j = 0; j < n; j++){
            if (isSafeToPlace(board,n,i,j) == true){
                board[i][j] = 1;
                boolean nextQueen = solveNQueen(board,i+1,n);
                if(nextQueen == true){
                    return true;
                }
                board[i][j] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the dimensions of board");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int board[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = 0;
            }
        }
        solveNQueen(board,0,n);
    }
}
