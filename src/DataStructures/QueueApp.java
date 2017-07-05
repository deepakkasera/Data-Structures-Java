package DataStructures;

/**
 * Created by deepak on 5/7/17.
 */
public class QueueApp {

    public static void main(String[] args) throws Exception {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(60);
        queue.enqueue(70);
//        queue.enqueue(50);


        queue.display();
//         ue.front());
    }
}
