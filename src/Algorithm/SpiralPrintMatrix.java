package Algorithm;

import java.util.Scanner;

/**
 * Created by deepak on 26/6/17.
 */
public class SpiralPrintMatrix {
    public static void spiralPrint(int a[][],int m,int n){
        int startRow = 0, endRow = m-1;
        int startCol = 0, endCol = n-1;
        while(startRow <= endRow && startCol <= endCol)
        {
            for(int i = startCol; i <= endCol; i++){
                System.out.print(a[startRow][i] + " ");
            }
            startRow++;
            for(int i = startRow; i <= endRow; i++){
                System.out.print(a[i][endCol] + " ");
            }
            endCol--;
            if(startRow < endRow){
                for(int i = endCol; i >= startCol; i--){
                    System.out.print(a[endRow][i] + " ");
                }
                endRow--;
            }
            if(startCol < endCol){
                for(int i = endRow; i >= startRow; i--){
                    System.out.print(a[i][startCol] + " ");
                }
                startCol++;
            }
        }
    }

    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("Enter the elements of matrix ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        spiralPrint(a,m,n);
    }
}
