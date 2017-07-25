package Algorithm;

import java.util.*;
/**
 * Created by deepak on 6/7/17.
 */
public class StringPermutations {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        ArrayList<String> stringArrayList;
        stringArrayList = getPerms(s);
        for (String str : stringArrayList) {
            System.out.print(str + " ");
        }
    }

    public static ArrayList<String> getPerms(String s) {

        if (s.length() == 0) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        char ch = s.charAt(0);
        String restOfString = s.substring(1);

        ArrayList<String> a = getPerms(restOfString);

        ArrayList<String> myResult = new ArrayList<>();

        for (String str : a) {
            for (int i = 0; i <= str.length(); i++){
                String myStr = str.substring(0,i) + ch + str.substring(i);
                myResult.add(myStr);
            }
        }

        return myResult;

    }
}
