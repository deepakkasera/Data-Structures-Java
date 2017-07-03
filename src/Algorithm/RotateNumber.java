package Algorithm;

import java.util.Scanner;

/**
 * Created by deepak on 2/7/17.
 */
public class RotateNumber {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k;
        k = sc.nextInt();
//        System.out.println(numberOfDigits(n));
        System.out.println(rotate(n,k));
    }


    public static int rotate(int num , int k) {
        int rv = 0;
        int nod = numberOfDigits(num);
        k %= nod;
        if (k < 0){
            k += nod;
        }

        int temp = num;

        int fp = temp / (int) Math.pow(10,k);
        int sp = temp % (int) Math.pow(10,k);

        rv = (int) (sp*Math.pow(10,nod-k) + fp);
        return rv;
    }

    public static int numberOfDigits (int num) {
        int cnt = 0;
        while (num != 0) {
            cnt++;
            num /= 10;
        }
        return cnt;
    }

}
