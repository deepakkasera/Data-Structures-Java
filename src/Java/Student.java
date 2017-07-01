package Java;

/**
 * Created by deepak on 1/7/17.
 */
public class Student {
    private String name;


    public void setName(String name) throws Exception {
        if(name == null || name.length() == 0){
            throw new Exception("Name can not be null or empty");
        }

        this.name = name;

    }

    public String getName() {
        return name;
    }

    public final int rollNo;

    private static int numStudents;

    public static final int MAX_STUDENT_LIMIT = 1000;

    //Static functions can be called without making an object
    //Rule 1 : cant use this inside a static funtions
    //Rule 2 : Static functions can't use non static data members inside it
    public static int getNumStudents(){
        return numStudents;
    }

    //Non static functions can use static data members
    public void sayHi() {
        System.out.println(this.name + " says Hi to " + Student.numStudents);
    }

    public Student(String name) throws Exception {

        if(this.numStudents == this.MAX_STUDENT_LIMIT){
            throw new Exception("LIMT REACHED");
        }

        setName(name);
        this.numStudents++;
        this.rollNo = this.numStudents;

    }
}
