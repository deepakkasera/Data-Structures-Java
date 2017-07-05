package DataStructures;

import kotlin.internal.Exact;

/**
 * Created by deepak on 5/7/17.
 */
public class Queue {
    private int[] data;
    private int front;
    private int size;
    private int rear;


    public static final int DEFAULT_CAPACITY = 10;

    public Queue(int capacity) {
        this.data = new int[capacity];
        front = 0;
        size = 0;
    }

    public Queue () {
        this(DEFAULT_CAPACITY);
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty () {
        return this.size == 0;
    }

    public void display () {
        for (int i = 0; i < this.size; i++) {
            int temp =  ( this.front + i ) % this.data.length;
            System.out.print(this.data[temp] + " ==> ");
        }
        System.out.println("END");
    }

    public void enqueue (int item) throws Exception {
        if (this.size == this.data.length) {
            throw new Exception( "Queue is full" );
        }
        int rear = ( this.front + this.size )%this.data.length;
        data[rear] = item;
        this.size++;
    }

    public  int front () throws Exception {
        if (this.isEmpty() == true) {
            throw new Exception("Queue is Empty");
        }
        return data[this.front];
    }

    public int dequeue () throws Exception {

        if (this.isEmpty() == true) {
            throw new Exception("Queue is Empty");
        }

        int x =  data[this.front];
        this.data[this.front] = 0;
        this.front =  ( this.front + 1 ) % this.data.length;
        this.size--;
        return x;
    }
}
