package pl.sdacademy;

public class BubbleSort {
    public static void main(String[] args) { //zakomentowane sa zmiany wprowadzone przez prowadzacego
        //List<Integer> array = new ArrayList<>();
        int[] array = {3, 6, 2, 4, 1, 7, 9, 17};
        System.out.println("Tablica do sortowania: ");
        printArray(array);
        sortBubble(array);
        System.out.println("\nTabilca posortowana: ");
        printArray(array);
    }
 /*
    private static void generateNumbersInList(List<Integer> list, int j){
        Random random = new Random() <-- czesc niedokonczona, sprawdzic na github
    }
*/
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        // Array.stream(array).forEach(i ->{ }); < -- nowa metoda iterowania po prostych tablicach int od JAVA 8
    }

    private static void sortBubble(int[] array) {
        int a;
        int b;
        int counter = 0;

        while (counter < array.length) {
            for (int i = 0; i < array.length - 1; i++) {
                a = array[i];
                b = array[i + 1];
                if (a > b) {
                    array[i] = b;
                    array[i + 1] = a;
                } else {
                    continue;
                }
            }
            counter++;
        }
    }
}
