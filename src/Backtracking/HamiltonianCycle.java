package Backtracking;

/**
 * Created by deepak on 29/6/17.
 */
public class HamiltonianCycle {

    private int numberOfVerices;
    private int[] hamiltonianPath;
    private int[][] adjancecncyMatrix;

    public HamiltonianCycle(int[][] adjancecncyMatrix) {
        this.adjancecncyMatrix = adjancecncyMatrix;
        this.hamiltonianPath = new int[adjancecncyMatrix.length];
        this.numberOfVerices = adjancecncyMatrix.length;

        this.hamiltonianPath[0] = 0;

    }


    public void solve() {
        if( !feasibleSolution(1)){
            System.out.println("No feasible solution.....");
        }
        else{
            showHamiltonianPath();
        }
    }

    private void showHamiltonianPath() {

        System.out.println("Hamiltonian Cycle ");

        for(int i = 0; i < hamiltonianPath.length; i++){
            System.out.print(hamiltonianPath[i] + " ");
        }

        System.out.print(hamiltonianPath[0]);
    }

    private boolean feasibleSolution(int position) {

        if(position == numberOfVerices){

            if(adjancecncyMatrix[hamiltonianPath[position-1]][hamiltonianPath[0]] == 1){
                return true;
            }
            else{
                return false;
            }
        }
        for(int vertexIndex = 1; vertexIndex < numberOfVerices; ++vertexIndex){
            if ( isFeasible(vertexIndex , position) ){

                hamiltonianPath[position] = vertexIndex;

                if( feasibleSolution(position + 1) ){
                    return true;
                }

                //BACKTRACK!!!!
            }

        }

        return false;
    }

    private boolean isFeasible(int vertexIndex, int actualPosition) {

        if(adjancecncyMatrix[hamiltonianPath[actualPosition-1]][vertexIndex] == 0){
            return false;
        }

        for (int i = 0; i < actualPosition; i++){
            if(hamiltonianPath[i] == vertexIndex){
                return false;
            }
        }

        return true;
    }
}
