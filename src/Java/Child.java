package Java;

/**
 * Created by deepak on 7/8/17.
 */
public class Child extends Parent{
    int d2 = 11;
    int d  = 21;

    void fun() {

        //Super refers to the object of immediate parent class in inheritance
        super.fun();
        System.out.println("Child's Fun");

    }
}
