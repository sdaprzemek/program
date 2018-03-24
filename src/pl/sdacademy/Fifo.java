package pl.sdacademy;
//!!!!!Zrobic jeszcze raz po swojemu, na spokojnie w domu!!!!!!!
//pomieszanie z poplataniem przez klasy generyczne
public class Fifo<T> {
    private final static int SIZE = 5;
    private Object[] queue;
    private int index;
    private int counter = 0;

    public Fifo() {
        queue = new Object[SIZE];
        index = -1;
    }

    public T pop() {
        Object tmp = queue[counter];
        reprintingQueue();
        return (T) tmp;
    }

    public void push(T i) {
        if(index >= queue.length-1) {
            extendQueue();
        }
        queue[++index] = i;
    }

    public T peek() {
        return (T) queue[index];
    }

    public void reprintingQueue() {
        Object[] newQueue = new Object[queue.length];
        for (int i = 0; i < queue.length; i++) {
            newQueue[i]=queue[i+1];
        }
        queue = newQueue;
    }

    private void extendQueue() {
        Object[] newQueue = new Object[queue.length + SIZE];
        for (int i = 0; i < queue.length; i++) {
            newQueue[i] = queue[i];
        }
        queue = newQueue;
    }

}
