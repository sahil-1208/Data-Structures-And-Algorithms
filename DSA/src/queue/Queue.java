package queue;

public class Queue {

    public static void main(String[] args) {

        QueueImpl queueImpl = new QueueImpl(4);

        queueImpl.enQueue(5);
        queueImpl.enQueue(6);
        queueImpl.enQueue(7);
        queueImpl.enQueue(8);

        System.out.println("Dequeue Element : " + queueImpl.deQueue().value); //4
        System.out.println("Dequeue Element : " + queueImpl.deQueue().value); //5
        System.out.println("Dequeue Element : " + queueImpl.deQueue().value); //6


        System.out.println("First : " + queueImpl.getFirst().value);
        System.out.println("Last : " + queueImpl.getLast().value);
        System.out.println("Length : " + queueImpl.getLength());


        System.out.println("Queue : ");
        queueImpl.printQueue();

    }
}
