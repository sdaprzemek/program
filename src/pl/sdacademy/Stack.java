package pl.sdacademy;

public class Stack {
    private final static int SIZE = 10;
    private Integer[] stack;
    private int index;

    public Stack() { //konstruktor
        stack = new Integer[SIZE];
        index = -1;
    }

    public void push(Integer i) {
        index++;
        if (index >= stack.length) {
            extendStack();
        }
        stack[index] = i;
    }

    private void extendStack() {
        Integer[] newStack = new Integer[stack.length + SIZE];
        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    public Integer pop() {
        Integer tmp = stack[index];
        index--;
        return tmp;
        //return stack[--index]; <-- to samo co powyżej ale w jednej linijce
    }

    public int size() {
        return index;
    }

    public Integer peek() {
        return stack[index];
    }

    public void print() {
        for (int i = 0; i <= index; i++) {
            System.out.println(stack[i]);
        }
    }
}

