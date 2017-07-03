package DataStructures;

/**
 * Created by deepak on 1/7/17.
 */
public class Stack {
    private int[] data;
    private int tos = -1;

    public static final int DEFAULT_CAPACITY = 10;

    public Stack (int capacity) {
        this.data = new int[capacity];
        this.tos = -1;
    }

    public Stack () {
        this(DEFAULT_CAPACITY);
    }

    public void push (int item) throws Exception {

        if (this.tos == data.length - 1){
            throw new Exception ("Stack is Full");
        }

        this.tos++;
        this.data[this.tos] = item;

    }

    public int top () throws Exception {

        if (this.size() == 0){
            throw new Exception ("Stack is Empty");
        }

        int x = this.data[this.tos];
        return x;
    }

    public int pop () throws Exception {
        if (this.size() == 0){
            throw new Exception ("Stack is Empty");
        }

        int x = this.data[this.tos];
        this.data[this.tos] = 0;
        this.tos--;
        return x;
    }

    public int size() {
        return this.tos + 1;
    }

    public boolean isEmpty() {
        if (this.size() == 0){
            return true;
        }
        return false;
    }
    public void display(){
        if (this.size() == 0){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("Stack is ");
        for (int i = this.tos; i >= 0; i--){
            System.out.print(this.data[i] + " ");
        }
        System.out.println();
    }
}
