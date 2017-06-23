package Algorithm;

import java.util.Scanner;

/**
 * Created by deepak on 23/6/17.
 */
public class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int cnt[] = new int[64];
        for(int i = 0; i < n; i++){
            int num = arr[i];
            for(int j = 0; j < 64 && num > 0; j++){
//                int x = num & 1;
                if((num&1) == 1){
                    cnt[j]++;
                }
                num = num >> 1;
            }
        }
        int ans = 0;
        int power = 1;
        for(int i = 0; i < 64; i++){
            cnt[i]%=3;
            ans += (cnt[i]*power);
            power <<= 1;
        }
        System.out.println("Unique element is " + ans);
    }
}
