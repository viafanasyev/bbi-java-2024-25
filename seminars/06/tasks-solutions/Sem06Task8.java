public class Sem06Task8 {
    public static void main(String[] args) {
        IntQueue queue = new IntQueue();

        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(-1);
        System.out.println("Size: " + queue.size());

        System.out.println("Front: " + queue.front());

        queue.dequeue();
        System.out.println("Size: " + queue.size());

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Size: " + queue.size());

        queue.enqueue(100500);

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());

        System.out.println("Size: " + queue.size());

        queue.enqueue(-10);
        queue.enqueue(-20);
        queue.enqueue(-30);
        queue.enqueue(-40);
        queue.enqueue(-50);

        System.out.println("Size: " + queue.size());

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());

        System.out.println("Size: " + queue.size());
    }
}
