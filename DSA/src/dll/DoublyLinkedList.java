package dll;

public class DoublyLinkedList {

    public static void main(String[] args) {

        DoublyLLImpl doublyLinkedList = new DoublyLLImpl(4);

        doublyLinkedList.append(5);
        doublyLinkedList.append(6);
        doublyLinkedList.prepend(3);

        System.out.println("Head : " + doublyLinkedList.getHead().value);
        System.out.println("Tail : " + doublyLinkedList.getTail().value);
        System.out.println("Length : " + doublyLinkedList.getLength());
//        System.out.println("\n");
       System.out.println("Element on the given Index : " +doublyLinkedList.get(2).value);
       System.out.println("Insert element on the given Index : " +doublyLinkedList.insert(2,9));
       System.out.println("Remove element on the given Index : " +doublyLinkedList.remove(3).value);
//       System.out.println("Set Value : " + doublyLinkedList.set(2, 9));
//        System.out.println("Remove Last : " + doublyLinkedList.removeLast().value);
//        System.out.println("Remove First : " + doublyLinkedList.removeFirst().value);

        System.out.println("Doubly LinkedList : ");
        doublyLinkedList.printList();

    }
}
