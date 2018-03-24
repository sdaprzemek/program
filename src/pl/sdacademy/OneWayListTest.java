package pl.sdacademy;

public class OneWayListTest {

    public static void main(String[] args) {
        OneWayList lista = new OneWayList();
        Element jan = new Element("Jan");
        Element adam = new Element("Adam");
        Element marek = new Element("Marek");
        Element przemek = new Element("Przemek");

        lista.add(jan);
        lista.add(adam);
        lista.add(marek);
        lista.add(przemek);

        System.out.println(lista);

        lista.remove(2);
    }
}
