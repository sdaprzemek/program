package pl.sdacademy.Listy;

public class Node {
   public Node next;
    public Integer data;

    public Node(Integer data) {
        next = null;
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }
}
