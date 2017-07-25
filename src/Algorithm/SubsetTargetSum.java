package Algorithm;

import java.util.*;

import java.util.ArrayList;

/**
 * Created by deepak on 25/7/17.
 */
public class SubsetTargetSum {

    public static ArrayList< ArrayList<Integer> > getSubsetTargetSum(int[] a,
                                                                     int si,
                                                                     int target,
                                                                     int currentSum)
    {

        ArrayList<ArrayList<Integer> > myResult = new ArrayList<>();

        if (si == a.length) {
            if(currentSum == target){

                ArrayList<ArrayList<Integer> > br = new ArrayList<>();

                br.add(new ArrayList<>());

                return br;
            }
            else {

                ArrayList<ArrayList<Integer> > br = new ArrayList<>();

                return br;
            }
        }

        //Exclude the current item
        ArrayList<ArrayList<Integer> > exc = getSubsetTargetSum(a,si+1,target,currentSum);

        for (ArrayList<Integer> i : exc){
            myResult.add(i);
        }

        //include the current item
        ArrayList<ArrayList<Integer>> inc = getSubsetTargetSum(a,si+1,target,currentSum + a[si]);

        for (ArrayList<Integer> i : inc) {
            i.add(a[si]);
            myResult.add(i);
        }

        return myResult;
    }

    public static void main(String[] args) {
        System.out.println(getSubsetTargetSum(new int[] {1,2,3,4,5} , 0 , 5 , 0));
    }
}
