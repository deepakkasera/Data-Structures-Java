package Algorithm;

import java.util.Scanner;

/**
 * Created by deepak on 26/6/17.
 */
public class EuclideanAlgo{

    public static int gcdRecursive(int a, int b){
        if(b == 0){
            return a;
        }
        return gcdRecursive(b,a%b);
    }

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("GCD of two numbers is "  + gcdRecursive(a,b));
    }
}
