package Algorithm;

import java.util.Scanner;

/**
 * Created by deepak on 26/6/17.
 */
public class TowerOfHanoi {
    public static void hanoi(int n,char src,char helper,char dest){
        if(n == 0){
//            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }

        hanoi(n-1,src,dest,helper);
        System.out.println("Move " + n + "th disk from " + src + " to " + dest);
        hanoi(n-1,helper,src,dest);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        char src = 'A';
        char helper = 'B';
        char dest = 'C';
        hanoi(n,src,helper,dest);
    }
}
