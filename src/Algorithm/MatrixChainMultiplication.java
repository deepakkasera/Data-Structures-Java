package Algorithm;

/**
 * Created by deepak on 2/7/17.
 */
public class MatrixChainMultiplication {
    public static void main(String[] args) {

        int dims[] = {10,20,30,40,50,60};
        int n = dims.length;

        System.out.println(mcm(dims , 0 , dims.length - 1));
    }

    public static int mcm(int[] dims , int si , int ei) {

        if (ei == si + 1) {
            return 0;
        }

        int minimumCost = Integer.MAX_VALUE;
        for (int i = si+1; i < ei; i++){
            int cost1 = mcm(dims,si,i);
            int cost2 = mcm(dims,i,ei);
            int cost3 = dims[si] * dims[i] * dims[ei];

            int totalCost = cost1 + cost2 + cost3;

            minimumCost = Math.min (totalCost , minimumCost);
        }
        return minimumCost;
    }
}
