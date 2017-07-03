package Algorithm;

import java.util.Scanner;

/**
 * Created by deepak on 2/7/17.
 */
public class RotateArray {

    public static void main(String[] args) {
        int n,k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
    }

    public void rotateArray(int[] a , int k) {
        k = k % a.length;

        if (k < 0){
            k = k + a.length;
        }

        for (int i = a.length - 1; i >= a.length - k; i++) {

        }

    }
}
