package Algorithm;

import java.util.Scanner;
import java.util.*;

/**
 * Created by deepak on 19/6/17.
 */
public class PalindromicSubsequences {

    public static int PalindromicSSnumber(String str){
        int ans=0;

        // Odd length palindromes
        for (int i = 0; i < str.length(); i++){
            int j=0;
            while(i+j < str.length() && i-j >= 0){
                if(str.charAt(i+j) != str.charAt(i-j)) {
                    break;
                } else{
                    ans++;
                }
                j++;
            }
        }

        //Even length palindromes
        for(int i = 0; i < str.length(); i++){
            int j=0;
            while(i+j+1 < str.length() && i-j >= 0){
                if(str.charAt(i+j+1) != str.charAt(i-j)){
                    break;
                }
                else{
                    ans++;
                }
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.println("Number of Palindromic Subsequences " + PalindromicSSnumber(str));
    }
}
