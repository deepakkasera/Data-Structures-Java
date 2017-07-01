package Backtracking;

/**
 * Created by deepak on 29/6/17.
 */
public class HamiltonianApp {
    public static void main(String[] args) {

        int[][] matrix = {{0, 1, 0, 1, 0},
                {1, 0, 1, 1, 1},
                {0, 1, 0, 0, 1},
                {1, 1, 0, 0, 1},
                {0, 1, 1, 1, 0},
        };
        HamiltonianCycle hamiltonianCycle = new HamiltonianCycle(matrix);
        hamiltonianCycle.solve();
    }
}
