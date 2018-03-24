package pl.sdacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        generateNumbersInList(list, 10);
        System.out.println(list);

        list = doTheSorting(list);
        System.out.println(list);
    }

    private static void generateNumbersInList(List<Integer> list, int j) {
        Random random = new Random();
        for (int i = 0; i < j; i++) {
            list.add(random.nextInt(100));
        }
    }

    private static List<Integer> doTheSorting(List<Integer> list) {
        return list;
    }
}
