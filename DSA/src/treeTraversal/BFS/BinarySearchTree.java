package treeTraversal.BFS;

import java.util.ArrayList;

public class BinarySearchTree {

    public static void main(String[] args) {

        Bst binarySearchTree = new Bst();

        binarySearchTree.Insert(47);
        binarySearchTree.Insert(21);
        binarySearchTree.Insert(76);
        binarySearchTree.Insert(18);
        binarySearchTree.Insert(27);
        binarySearchTree.Insert(82);
        binarySearchTree.Insert(52);

        System.out.println("Breadth First Search : " + binarySearchTree.bfs());

    }
}
