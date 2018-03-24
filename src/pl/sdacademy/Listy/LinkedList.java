package pl.sdacademy.Listy;

public class LinkedList {
    private Node head;
    private Node lastNode;
    private int size;

    public LinkedList() {
        head = new Node(null); //Node(null) <- tzw. dummy node, w którym nigdy nie będzie żadnych danych (data)
        lastNode = head;
    }

    public void insertAt(int index, Integer data) {
        if (index <=0 || index > size) {
            return;
        } else if (index == 1) {
            addFromHead(data);
        } else if (index == size) {
            addFromTail(data);
        } else {
            Node listElement = new Node(data);
            Node n = head.next;
            int counter = 1;
            while (counter != index - 1) {
                n = n.next;
                counter++;
            }
            Node tmp = n.next;
            n.next = listElement;
            listElement.next = tmp;
            size++;
        }

    }

    public void addFromTail(Integer data) {
        Node listElement = new Node(data);
        if (size == 0) {
            head.next = listElement;
            lastNode = listElement;
            size++;
        } else {
            lastNode.next = listElement;
            lastNode = listElement;
            size++;
        }
    }

    public void addFromHead(Integer data) {
        Node listElement = new Node(data);
        if (size == 0) {
            head.next = listElement; // <- zmiennej next (obiektu head = Node(null)) przypisano adres kolejnego obiektu Node(data)
            lastNode = listElement;
            size++;
        } else {
            Node tmp = head.next; //zapisujemy miejsce, na które wskazuje head.next ponieważ jeśli wstawimy na początek nowy Node
            //to zmieniamy wskazanie head.next na nowy Node(data), a nie chcemy stracić tych danych dla poprzedniego Node
            head.next = listElement;
            listElement.next = tmp; //zmienna next nowo wstawionego elementu będzie wskazywać na element, na który wcześniej
            //wskazywała zmienna head.next
            size++;
        }
    }

    public void removeAt(int index) {
        if (index <=0 || index > size) {
            return;
        } else if (index == 1) {
            removeFirst();
        } else if (index == size) {
            removeLast();
        } else {
            Node listElement = head.next;
            int counter = 1;
            while (counter != index - 1) {
                listElement = listElement.next;
                counter++;
            }
            listElement.next = listElement.next.next;
            size--;
        }
    }

    public void removeFirst() {
        if (size != 0) {
            head.next = head.next.next;
            size--;
        }
    }

    public void removeLast() {
        int index;
        if (size == 0) {
            return;
        }
        if (size == 1) {
            head.next = null;
            lastNode = head;
            size--;
        }
        if (size > 1) {
            Node listElement = head.next;
            index = 1;
            while (index != size - 1) {
                listElement = listElement.next;
                index++;
            }
            lastNode = listElement;
            lastNode.next = null;
            size--;
        }
    }

    public Integer getSize() {
        return size;
    }

    public String toString() {
        Node listElement = head.next; //<-wskazanie pierwszego elementu listy Node(data)
        String tmpContentOfTheList = "";
        while (listElement != null) { // <- iterujemy póki wskazanie na kolejny element jest null czyli końcem listy
            tmpContentOfTheList += listElement.data + " | ";
            listElement = listElement.next;
        }
        return tmpContentOfTheList;
    }

    public Integer get(int index) {

        return 0;
    }
}
