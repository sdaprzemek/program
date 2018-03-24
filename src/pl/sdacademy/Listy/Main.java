package pl.sdacademy.Listy;

public class Main {
    public static void main(String[] args) {
        LinkedList TestList = new LinkedList();
        TestList.addFromHead(9);
        TestList.addFromHead(3);
        TestList.addFromHead(123);
        TestList.addFromHead(1);
        System.out.println(TestList.getSize());
        System.out.println(TestList);

        TestList.addFromTail(56);
        TestList.addFromTail(52);
        TestList.addFromTail(43);

        System.out.println(TestList.getSize());
        System.out.println(TestList);

        TestList.removeFirst();
        System.out.println(TestList);

        TestList.removeLast();
        TestList.removeLast();
        System.out.println(TestList);

        TestList.insertAt(3, 1000);
        TestList.insertAt(1, 1500);
        TestList.insertAt(6, 5000);
        System.out.println(TestList);

        TestList.removeAt(1);
        System.out.println(TestList);
        TestList.removeAt(6);
        System.out.println(TestList);
        TestList.removeAt(3);
        System.out.println(TestList);
       // TestList.insert();
       // TestList.remove();
       // TestList.showList();
    }
}
