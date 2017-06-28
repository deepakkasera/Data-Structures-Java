package Algorithm;

import java.util.Scanner;

/**
 * Created by deepak on 27/6/17.
 */
public class UniqueNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int resultXor = 0;
        for(int i = 0; i < n; i++){
            resultXor ^= a[i];
        }
        int x = resultXor;
        int element1 = 0,element2 = 0;

        //to get the rightmost set bit in number x
        int mask = x & (-1*x);
        for(int i = 0; i < n; i++){
            if((a[i] & mask) == 1){
                element1 ^= a[i];
            }
        }

        element2 = resultXor^element1;
        System.out.println("Two unique elements are " + element1 + " and " + element2);
    }
}
