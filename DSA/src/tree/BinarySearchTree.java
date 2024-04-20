package tree;

public class BinarySearchTree {

    public static void main(String[] args) {

           BstImpl bstImpl = new BstImpl();

           bstImpl.Insert(5);
           bstImpl.Insert(4);
           bstImpl.Insert(6);
           bstImpl.Insert(8);
           bstImpl.Insert(7);

        System.out.println(bstImpl.getRoot().left.value); //4
        System.out.println(bstImpl.getRoot().right.right.left.value); //7
        System.out.println(bstImpl.getRoot().right.value); //6
        System.out.println(bstImpl.getRoot().right.right.value); //8

        System.out.println(bstImpl.contains(4));
        System.out.println(bstImpl.contains(2));
    }
}
