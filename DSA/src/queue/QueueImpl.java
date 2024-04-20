package queue;

public class QueueImpl {
    private Node first;
    private Node last;
    private int length;

    public QueueImpl(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public int getLength() {
        return length;
    }

    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void enQueue(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node deQueue() {
        if (length == 0) return null;
        if (length == 1) {
            first = null;
            last = null;
        }
        Node temp = first;
        first = first.next;
        temp.next = null;
        length--;
        return temp;
    }
}

