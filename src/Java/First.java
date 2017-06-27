package Java;

import java.util.Scanner;

/**
 * Created by deepak on 27/6/17.
 */
public class First {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Hello World ");
        for(int i = 0; i < n; i++){
            System.out.println(i + "th element is " + a[i]);
        }
    }
}
