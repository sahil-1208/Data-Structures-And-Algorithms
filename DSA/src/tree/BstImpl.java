package tree;

public class BstImpl {
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

    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) temp = temp.left;
            if (value > temp.value) temp = temp.right;
            if (value == temp.value) return true;
        }
        return false;
    }

}
/*Insert
Create a new Node object called newNode with the given integer value.
If the root node is null, set the root to the newNode and return true.
Create a temporary node called temp and set it to the root node.
Use a while loop to traverse the tree:
If the newNode value is equal to the temp node value, return false (no duplicates allowed).
If the newNode value is less than the temp node value:
If the left child of temp is null, set the left child to newNode and return true.
Otherwise, set temp to its left child.
If the newNode value is greater than the temp node value:
If the right child of temp is null, set the right child to newNode and return true.
Otherwise, set temp to its right child.
* */