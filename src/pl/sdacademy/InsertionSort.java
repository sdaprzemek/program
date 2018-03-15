package pl.sdacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InsertionSort {

    public static void main(String[] args) {
        List <Integer> list = new ArrayList <>();
        generateNumbersInList(list, 10);
        System.out.println(list);

        list = InsertSort(list);
        System.out.println(list);
    }

    private static List <Integer> InsertSort(List <Integer> list) {
        //TODO napisac implementacje metody sortowania
        //TODO - DO POPRAWKI - BLEDY LOGICZNE DLA SORTOWANIA. JESZCZE RAZ PRZEMYSLEC
        for (int i = 1; i <= list.size(); i++) {
            while(i > 0) {
                int a = list.get(i);
                int b = list.get(i - 1);
                if (a < b) {
                    list.set(i - 1, a);
                    list.set(i, b);
                    i--;
                } else {

                }
            }
            continue;
        }
        return list;
    }

    private static void generateNumbersInList(List <Integer> list, int j) {
        Random random = new Random();
        for (int i = 0; i < j; i++) {
            list.add(random.nextInt(100));
        }

    }
}
