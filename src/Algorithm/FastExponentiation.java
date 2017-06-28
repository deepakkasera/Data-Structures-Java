package Algorithm;

import java.util.Scanner;

/**
 * Created by deepak on 28/6/17.
 */
public class FastExponentiation {
    public static int power(int n , int x){
        if(x == 0){
            return 1;
        }
        int p = power(n,x/2);
        if(x%2 == 0){
            return p * p ;
        }
        return n * p * p;
    }
    public static void main(String[] args) {
        int n,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        System.out.println("Enter the value of x");
        x = sc.nextInt();
        System.out.println(power(n,x));
    }
}
