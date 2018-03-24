package pl.sdacademy;

public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(7);
        stack.push(3);
        stack.push(5);
        stack.push(6);
        stack.push(2);

        stack.print();

        System.out.println("Zdejmuje : " + stack.pop());

        stack.print();

    }
}
