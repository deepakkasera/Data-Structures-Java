package Java;

/**
 * Created by deepak on 7/8/17.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("------------Case1------------");

        Parent p  = new Parent();
        System.out.println(p.d1);
        System.out.println(p.d);
        p.fun();


        System.out.println("------------Case2-------------");
        Child c = new Child();
        System.out.println(c.d);
        System.out.println(c.d1);
        System.out.println(c.d2);
        c.fun();

        System.out.println("------------Case3----------");
        Parent obj = new Child();
        obj.fun();

        //Compiler is giving this error because the reference is of parent class
        System.out.println(obj.d1);
        obj.fun();
        obj.fun2();

        System.out.println("------------Case4----------");

//        Child o = new Parent();
//        System.out.println(o.d2);
    }
}
