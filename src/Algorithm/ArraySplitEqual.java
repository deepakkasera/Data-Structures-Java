package Algorithm;

/**
 * Created by deepak on 26/7/17.
 */
public class ArraySplitEqual {


    public static void arraySplit (int[] a,int si,String s1,String s2,int sum1,int sum2)
    {
        if(si == a.length){

            if(sum1==sum2){
                System.out.println(s1 + " & " + s2 );
            }
            return;

        }

        arraySplit(a,si + 1, s1 + a[si] + "," , s2 , sum1 + a[si] , sum2);

        arraySplit(a,si + 1, s1 , s2 + a[si] + "," , sum1 , sum2 + a[si]);

    }

    public static void main(String[] args) {
        arraySplit(new int[] {1,2,3,4,5,6,7} , 0 , "" , "" , 0 , 0);
    }

}
