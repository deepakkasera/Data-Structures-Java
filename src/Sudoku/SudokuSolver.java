package Sudoku;

/**
 * Created by deepak on 30/6/17.
 */
public class SudokuSolver {

    private int[][] sudokuTable;

    public SudokuSolver(int[][] sudokuTable) {
        this.sudokuTable = sudokuTable;
    }

    public void solveSudoku(){

        if(solve(0,0)){
            //Print the Sudoku Table
            printSudokuTable();
        }else{
            System.out.println("No feasible solution....");
        }
    }

    private void printSudokuTable() {
        for (int i = 0; i < Constants.BOARD_SIZE; i++){
            if(i % 3 == 0){
                System.out.println(" ");
            }
            for (int j = 0; j < Constants.BOARD_SIZE; j++){
                if(j%3 == 0){
                    System.out.print(" ");
                }
                System.out.print(sudokuTable[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    private boolean solve(int rowIndex , int colIndex){
        if(rowIndex == Constants.BOARD_SIZE && ++colIndex == Constants.BOARD_SIZE){
            return true;
        }

        if (rowIndex == Constants.BOARD_SIZE){
            rowIndex = 0;
        }

        if (sudokuTable[rowIndex][colIndex] != 0) {
            return solve(rowIndex + 1 , colIndex);
        }

        for(int num = Constants.MIN_NUMBER; num <= Constants.MAX_NUMBER; num++){
            if( isValidPlace(rowIndex,colIndex,num) ){
                sudokuTable[rowIndex][colIndex] = num;

                boolean nextPlace = solve(rowIndex+1,colIndex);

                if(nextPlace){
                    return true;
                }

                //Backtrack
                sudokuTable[rowIndex][colIndex] = 0;
            }
        }
        return false;
    }

    private boolean isValidPlace(int rowIndex,int colIndex,int num){

        for(int i = 0; i < Constants.BOARD_SIZE; i++){
            if(sudokuTable[i][colIndex] ==  num){
                return false;
            }
        }

        for(int i = 0; i < Constants.BOARD_SIZE; i++){
            if(sudokuTable[rowIndex][i] == num){
                return false;
            }
        }

        int boxRowOffset = (rowIndex / 3) * Constants.BOX_SIZE;
        int boxColOffset = (colIndex / 3) * Constants.BOX_SIZE;

        for(int i = 0; i < Constants.BOX_SIZE; i++){
            for(int j = 0; j < Constants.BOX_SIZE; j++){
                if(sudokuTable[boxRowOffset + i][boxColOffset + j] == num){
                    return false;
                }
            }
        }

        return true;
    }
}
