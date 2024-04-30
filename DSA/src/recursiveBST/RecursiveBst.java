package recursiveBST;

public class RecursiveBst {

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.rInsert(10);
        binarySearchTree.rInsert(5);
        binarySearchTree.rInsert(22);
        binarySearchTree.rInsert(4);
        binarySearchTree.rInsert(44);
        binarySearchTree.rInsert(8);

        System.out.println(binarySearchTree.getRoot().value);       //10
        System.out.println(binarySearchTree.getRoot().left.value);  //5
        System.out.println(binarySearchTree.getRoot().right.value);  //22
        System.out.println(binarySearchTree.rContains(32));   //false
        System.out.println(binarySearchTree.rContains(44));  //true
        binarySearchTree.deleteNode(44);
        System.out.println(binarySearchTree.rContains(44));    //false
        System.out.println(binarySearchTree.getRoot().right.right);  //null
    }
}
