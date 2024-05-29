package treeTraversal.DFS;

import java.util.ArrayList;

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

    public ArrayList<Integer> preOrderDFS() {
        ArrayList<Integer> result = new ArrayList<>();
        class Traverse {
            Traverse(Node currentNode) {
                result.add(currentNode.value);
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return result;
    }

    public ArrayList<Integer> postOrderDFS() {
        ArrayList<Integer> result = new ArrayList<>();
        class Traverse {
            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
                result.add(currentNode.value);
            }
        }
        new Traverse(root);
        return result;
    }

    public ArrayList<Integer> inOrderDFS() {
        ArrayList<Integer> result = new ArrayList<>();
        class Traverse {
            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                result.add(currentNode.value);
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return result;
    }
}
