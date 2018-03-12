package pl.sdacademy.Week1ExtraTasks;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class WeekOneSmallPrograms {
    public static void main(String[] args) {
        JavaIsSuper();
        CubeNumber();

    }

    private static void JavaIsSuper() {
        System.out.println("**************************");
        System.out.println("\tJAVA JEST SUPER!");
        System.out.println("**************************");
    }

    private static void CubeNumber() {
        //TODO wstawic try i catch dla wpisanych złych wartosci (String, char i . zamiast ,)
        Scanner scan = new Scanner(System.in);
        System.out.println("\nPodaj liczbę: ");
        double number = scan.nextDouble();
        double number3 = Math.pow(number, 3);
        System.out.println("Liczba " + number + " podniesiona do potęgi 3 = " + number3 );
    }
}
