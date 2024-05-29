package treeTraversal.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bst {
    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public Node getRoot() {
        return root;
    }

    public boolean Insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public ArrayList<Integer> bfs() {
        Node currentNode = root;
        Queue<Node> nodeQueue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        nodeQueue.add(currentNode);

        while (nodeQueue.size() > 0) {
            currentNode = nodeQueue.remove();
            result.add(currentNode.value);

            if (currentNode.left != null) {
                nodeQueue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                nodeQueue.add(currentNode.right);
            }
        }
        return result;
    }
}
