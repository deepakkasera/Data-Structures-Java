package DataStructures;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by deepak on 1/7/17.
 */
public class StackApp {
    public static void main(String[] args) throws Exception {

//        try {
//            Stack st = new Stack(5);
//            st.push(10);
//            st.display();
//            st.push(20);
//            st.display();
//            st.push(30);
//            st.display();
//            st.push(40);
//            st.display();
//            st.push(50);
//            st.display();
//            st.push(60);
//            System.out.println("Hello");
//        }catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }
        Stack st = new Stack(5);
        st.push(10);
        st.push(50);
        st.push(20);
        st.push(80);
        st.push(5);

        st.display();

        System.out.print("Stack in reverse order is ");
        printStackReverse(st);
        System.out.println();
        st.display();
//        System.out.println("BYE");
        System.out.print("Maximum in stack is ==> " + maxInStack(st) + "\n");
        sortTheStack(st);
        System.out.print("Sorted order ");
        st.display();
    }

    public static void printStackReverse (Stack st) throws Exception {
        if (st.size() == 0){
            return ;
        }
        int temp = st.pop();
        printStackReverse(st);
        st.push(temp);
        System.out.print(temp + " ");
    }

    public static int maxInStack(Stack st) throws Exception {

        if (st.size() == 0){
            return Integer.MIN_VALUE;
        }

        int temp = st.pop();
        int maxOfRest = maxInStack(st);

        st.push(temp);

        return Math.max(temp , maxOfRest);
    }

//    public static int countSorted = 0;
    public static void sortTheStack (Stack st) throws Exception {

        Stack helper = new Stack(st.size());

        int countSortedItems = 0;
        int finalCount = st.size();

        while(countSortedItems != finalCount) {

            int max = Integer.MIN_VALUE;

            while(st.size() != countSortedItems) {
                int item = st.pop();

              max = Integer.max(item , max);
//                if (item > max){
//                    max = item;
//                }

                helper.push(item);
            }

            st.push(max);
            countSortedItems++;

            while ( !helper.isEmpty() ) {
                int temp = helper.pop();

                if (temp != max) {
                    st.push(temp);
                }
            }
        }
    }
}
