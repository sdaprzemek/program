package pl.sdacademy.Tree;

import com.sun.xml.internal.messaging.saaj.soap.impl.TreeException;

public class Tree {
    private Node root;
    private int size;

    public void add(Integer data) {
        if (root == null) {
            root = new Node(data, null);
        } else {
            root.add(new Node(data, root));
        }
    }

    public boolean search(Integer data) {
        if (root.getValue() == data) {
            return true;
        } else {
            return root.search(data);
        }
    }

    /* JEDNO Z ROZWIĄZAN DLA METODY SEARCH <- bez tworzenia metody search w klasie Node
    public boolean search(int data) {
        Node actual = root;
        while (actual != null && actual.getValue() != data)
            //actual = (actual.getValue() > data) ? altual.getLeft : actual.getRight(); <- zapis rownoważny z petlą if
            if (actual.getValue() > data) {
                actual = actual.getLeft();
            } else {
                actual = actual.getRight();
            }
        if (actual == null) return false;
        return true;
    }
    */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Root:\n");
        sb.append(root.getValue());
        sb.append("\n");
        sb.append(root.toString());
        return sb.toString();
    }
}
