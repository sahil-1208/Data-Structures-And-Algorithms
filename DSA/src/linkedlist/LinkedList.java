package linkedlist;

public class LinkedList {

    public static void main(String[] args) {

        LinkedListImpl linkedList = new LinkedListImpl(4);

        linkedList.append(7);
        linkedList.append(8);
        linkedList.append(5);
        linkedList.prepend(3);
//        linkedList.removeFirst();
//        linkedList.removeLast();
        System.out.println("Head : " + linkedList.getHead().value);
        System.out.println("Tail : " + linkedList.getTail().value);
        System.out.println("Length : " + linkedList.getLength());
//        System.out.println("\n");
//        System.out.println("Element on the given Index : " + linkedList.get(2).value);
//        System.out.println("Set Value : " + linkedList.set(2, 9));

        System.out.println("LinkedList : ");
        linkedList.printList();

    }
}
