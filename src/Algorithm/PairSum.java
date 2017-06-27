package Algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by deepak on 27/6/17.
 */
public class PairSum {
    public static void pair(Integer[] a, int n, int sum){
        int s = 0;
        int e = n-1;
        while(s <= e){
            if(a[s] + a[e] == sum){
                System.out.println("Pair with given sum is " + a[s] + " " + a[e]);
                return;
            }
            else if (a[s] + a[e] < sum){
                s++;
            }
            else{
                e--;
            }
        }
        if(s > e){
            System.out.println("Pair with given sum is not present ");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int sum;
        System.out.println("Enter the sum value ");
        sum = sc.nextInt();
        Integer a[] = new Integer[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        pair(a,n,sum);
        Arrays.sort(a , Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " " );
        }
    }
}
