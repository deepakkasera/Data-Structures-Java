package Algorithm;

import java.util.Scanner;

/**
 * Created by deepak on 27/6/17.
 */
public class RunLengthEncoding {
    public static String encode(String s){
        StringBuffer res = new StringBuffer();
        for(int i = 0; i < s.length(); i++){
            res.append(s.charAt(i));
            int runLength = 1;
            while(i + 1 < s.length() && s.charAt(i) == s.charAt(i+1)){
                i++;
                runLength++;
            }
            res.append(runLength);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String example = "aaaaabbbccdz";
//        Scanner sc = new Scanner(System.in);
//        s = sc.findInLine("");
        System.out.println(encode(example));
    }
}
