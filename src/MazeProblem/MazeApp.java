package MazeProblem;

/**
 * Created by deepak on 30/6/17.
 */
public class MazeApp {

    public static void main(String[] args) {

        int[][] mazeTable = {
                {1,1,1,1,1},
                {1,0,0,1,0},
                {0,0,0,1,0},
                {1,1,1,1,1},
                {1,1,1,0,0}
        };

        MazeSolver mazeSolver = new MazeSolver(mazeTable);
        mazeSolver.solve();

    }
}
