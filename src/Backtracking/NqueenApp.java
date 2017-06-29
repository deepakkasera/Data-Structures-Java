package Backtracking;

import java.util.Scanner;

/**
 * Created by deepak on 29/6/17.
 */
public class NqueenApp {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of queens ");
        n = sc.nextInt();
        NQueenSolver nQueenSolver = new NQueenSolver(n);
        nQueenSolver.solve();
    }
}
