package DataStructures;

/**
 * Created by deepak on 1/7/17.
 */
public class StackApp {
    public static void main(String[] args) {

        try {
            Stack st = new Stack(5);
            st.push(10);
            st.display();
            st.push(20);
            st.display();
            st.push(30);
            st.display();
            st.push(40);
            st.display();
            st.push(50);
            st.display();
            st.push(60);
            System.out.println("Hello");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("BYE");
    }
}
