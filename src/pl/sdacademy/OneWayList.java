package pl.sdacademy;

public class OneWayList {
    private Element first;

    public void add(Element e) {
        if (first == null) {
            first = e;
        } else {
            first.addNext(e);
        }
    }
//TODO - poprawić - przepisać ten fragment od prowadzącego, sprawdzic działanie, zgubiłem wątek myślowy.
    public void remove(int index) {
        if(index == 0) {
            first = first.getNext();
            //first.removeRef();
            //first = current;
        } else {
            Element current = first;
            Element prev = null;
            for (int i = 0; i < index; i++){
                prev = current;
                current = current.getNext();
            }
        }
    }

    @Override
    public String toString() {
        return "lista : " + first;
    }
}
