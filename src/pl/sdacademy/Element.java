package pl.sdacademy;

public class Element {
    private Element next;
    private String text;

    public Element(String text) {
        this.text = text;
    }

    public void addNext(Element e) {
        if (next == null) {
            next = e;
        } else {
            next.addNext(e);
        }
    }

    @Override
    public String toString() {
        return text + " " + next;
    }

    public Element getNext() {
        return next;
    }
}
