package pl.sdacademy.Week1ExtraTasks;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.Console;
import java.util.Scanner;

public class WeekOneSmallPrograms {
    public static void main(String[] args) {
        //JavaIsSuper();
        //CubeNumber();
        //OddNumbers();
        //FizzBuzz();
        //ProductNumbers();
        //SumToTheLimit();
        SumOfTheNumeberElements();

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
        System.out.println("Liczba " + number + " podniesiona do potęgi 3 = " + number3);
    }

    private static void OddNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nPodaj maksymalny zakres dla liczb naturalnych");
        int max = scan.nextInt();
        System.out.println("Liczby nieparzyste z zadanego przedniału od 0 - " + max);
        for (int i = 1; i <= max; i += 2) {
            System.out.print(i + ", ");
        }
    }

    private static void FizzBuzz() { //TODO przemyslec rozwiazanie, działa ale przy zmianie parametow programu trzeba pilnowac zmian w kilku miejscach
        // np. jesli chciałbym zastapic liczby 3 i 5 na 10 i 15 to musze pilnowac zmian w programie w kilku miejscach
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    private static void ProductNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość liczb do wprowadzanie : ");
        int num = scan.nextInt();
        int[] array = new int[num];
        int numArray;
        int sumOfArrayElements = 0;
        int average;

        for (int i = 0; i < num; i++) {
            System.out.print("Wprowadź liczbę nr " + (i + 1) + " : ");
            numArray = scan.nextInt();
            array[i] = numArray;
            sumOfArrayElements += array[i];
        }

        average = sumOfArrayElements / num;

        System.out.println("Wartość średniej arytmetycznej dla podanych liczb = " + average);
    }

    private static void SumToTheLimit() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj maksymalną wartość dla sumowania: ");
        int maxSum = scan.nextInt();
        int sum = 0;
        int counter = 0;

        while (sum < maxSum) {
            sum = sum + counter;
            counter++;
        }
        System.out.println("Suma dodanych liczb = " + sum);
        System.out.println("Dodano do siebie = " + counter + " liczb");
    }

    private static void SumOfTheNumeberElements() { //TODO dodać losowanie liczby naturalnej bez wpisywania przez uzytkownika
        Scanner scan = new Scanner(System.in);
        int number, result;

        System.out.println("Podaj liczbę naturalną : ");
        number = scan.nextInt();

        result = 0;
        while (number != 0) {
            result += number % 10;
            number /= 10;
        }
        System.out.println("suma cyfr podanej liczby wynosi " + result);
    }
}

