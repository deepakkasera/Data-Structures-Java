package Algorithm;

import java.util.Scanner;

/**
 * Created by deepak on 1/7/17.
 */
public class UniqeNumber3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements");
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int cnt[] = new int[64];
        for (int i = 0; i < n; i++) {
            int num = a[i];
            for (int j = 0; j < 64; j++){
                if ( (num & 1) == 1){
                    cnt[j]++;
                }
                num = num >> 1;
            }
        }
        int power = 1;
        int ans = 0;
        for (int i = 0; i < 64; i++){
            cnt[i] %= 3;
            ans += (cnt[i] * power);
            power = power << 1;
        }
        System.out.println("Unique element is " + ans);
    }
}
