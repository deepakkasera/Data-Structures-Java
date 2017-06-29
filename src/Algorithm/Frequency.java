package Algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by deepak on 29/6/17.
 */
public class Frequency {
    public static void frequency(int a[], int n){
        HashMap<Integer , Integer> hashMap = new HashMap<Integer , Integer>();
        for(int i = 0; i < n; i++){
            Integer b = hashMap.get(a[i]);

            if(b == null){
                hashMap.put(a[i],1);
            }

            else{
                hashMap.put(a[i],++b);
            }
        }

        for(Map.Entry m : hashMap.entrySet()){
            System.out.println("Frequency of element " + m.getKey() + " is " + m.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        frequency(a,n);
    }
}
