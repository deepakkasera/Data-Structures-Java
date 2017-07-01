package Java;

import java.util.Scanner;

/**
 * Created by deepak on 1/7/17.
 */
public class StudentApplication {


    public static void main(String[] args) {
//        System.out.println(s.getName());
//        Fun();

//        System.out.println("thank you");
        Student[] students = new Student[1001];

        try {
            for (int i = 0; i < students.length; i++) {
                System.out.println("Creating " + i + "th student ");
                students[i] = new Student(i + "th student ");
                System.out.println("Created " + i + "th student ");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("thank you");
    }

    public static void Fun() throws Exception {
        Student s = new Student("deepak");

        try {
            System.out.println("Line 1");
            s.setName(null);
            System.out.println("Line 2");

        }
        catch (Exception ex) {
            System.out.println("ERROR --> " + ex.getMessage());
        }

        System.out.println(s.getName());
    }
}
