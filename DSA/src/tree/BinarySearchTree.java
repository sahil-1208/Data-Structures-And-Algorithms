package tree;

public class BinarySearchTree {

    public static void main(String[] args) {

           Bst binarySearchTree = new Bst();

           binarySearchTree.Insert(5);
           binarySearchTree.Insert(4);
           binarySearchTree.Insert(6);
           binarySearchTree.Insert(8);
           binarySearchTree.Insert(7);

        System.out.println(binarySearchTree.getRoot().left.value); //4
        System.out.println(binarySearchTree.getRoot().right.right.left.value); //7
        System.out.println(binarySearchTree.getRoot().right.value); //6
        System.out.println(binarySearchTree.getRoot().right.right.value); //8

        System.out.println(binarySearchTree.contains(4));
        System.out.println(binarySearchTree.contains(2));
    }
}
