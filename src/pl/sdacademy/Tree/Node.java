package pl.sdacademy.Tree;

public class Node {
    private Node left;
    private Node right;
    private Node parent;
    private Integer data;

    public Node(int data, Node parent) {
        this.data = data;
        this.parent = parent;
    }

    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void add(Node node) {
        Node actual = this;
        Node parent = null;
        while (actual != null) {
            parent = actual;
            if(actual.data > node.getValue()) {
                actual = actual.left;
            } else {
                actual = actual.right;
            }
        }
        if (parent.data > node.getValue()) {
            parent.left = node;
            parent.left.parent = parent;
        } else {
            parent.right = node;
            parent.right.parent = parent;
        }
    }

    public Integer getValue() {
        return data;
    }

    public boolean search(int data) {
        Node actual = this;
        while(actual != null && actual.getValue() != data) {
            if(actual.data > data) {
                actual = actual.left;
            } else {
                actual = actual.right;
            }
        }
        if(actual == null) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {

        return String.valueOf(data);
    }
}
