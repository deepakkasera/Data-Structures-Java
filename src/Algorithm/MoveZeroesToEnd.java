package Algorithm;

import java.util.Scanner;

/**
 * Created by deepak on 19/6/17.
 */
public class MoveZeroesToEnd {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        int i = 0,j = 0;
        while(i < n && j < n){
            if(arr[j] != 0) j++;
            else if (arr[i] != 0){
                swap(arr,i,j);
                j++;
            }
            i++;
        }
        for (int k = 0; k < n; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
