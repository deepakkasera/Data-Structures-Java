package Backtracking;

/**
 * Created by deepak on 29/6/17.
 */
public class NQueenSolver {
    private int[][] board;
    private int numberOfQueens;

    public NQueenSolver(int numberOfQueens) {
        this.board = new int[numberOfQueens][numberOfQueens];
        this.numberOfQueens = numberOfQueens;
    }

    public void printQueens(){
        for (int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if (board[i][j] == 1){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void solve() {
        if(setQueens(0)) {
            printQueens();
        }
        else{
            System.out.println("No feasible solution.....");
        }
    }

    private boolean isPlaceValid(int rowIndex,int colIndex){
        // Check for row
        for(int i = 0; i < colIndex; i++){
            if(board[rowIndex][i] == 1){
                return false;
            }
        }

        for(int i = rowIndex , j = colIndex; i >= 0 && j >= 0; i--,j--){
            if(board[i][j] == 1)
                return false;
        }

        for(int i = rowIndex , j = colIndex; i < board.length && j >= 0; i++,j--){
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    private boolean setQueens(int columnIndex){
        if(columnIndex == numberOfQueens){
            return true;
        }
        for(int rowIndex = 0; rowIndex < numberOfQueens; rowIndex++){
            if (isPlaceValid(rowIndex,columnIndex)){
                board[rowIndex][columnIndex] = 1;
                if ( setQueens(columnIndex + 1) ){
                    return true;
                }

                //Backtracking !!!!!
                board[rowIndex][columnIndex] = 0;
            }
        }
        return false;
    }
}
