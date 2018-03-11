package pl.sdacademy;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.Scanner;

public class RouletteSimpleGame {

    public static void main(String[] args) {

        int money = 1000;
        System.out.println("Ruletka 1.0");
        System.out.println("Witaj Graczu, do obstawiania zakładów masz: " + money + " $");

        while (money > 0) {
            int valueRoulette = genRandom();
            int betSum = getBetSum();
            int betType = getBetType();
            boolean result = checkResult(betType, valueRoulette);

            if (result == true) {
                money = 2 * betSum + money;
            } else {
                money = money - betSum;
            }
            System.out.println("Wylosowana liczba to: " + valueRoulette);
            System.out.println("\nSuma posiadanych pieniędzy na dalszą grę: " + money + " $");
        }
        System.out.println("\nSkończyły Ci się pieniądze\n ***KONIEC GRY***");

    }

    private static boolean checkResult(int betType, int valueRoulette) {
        if (valueRoulette == 0 && betType == 3) {
            return true;
        }
        int modulo = valueRoulette % 2;
        if (modulo == 0 && betType == 1) {
            return true;
        } else if (modulo == 1 && betType == 2) {
            return true;
        } else {
            return false;
        }
    }

    private static int getBetType() {
        System.out.println("Jaki rodzaj zakładu Cię interesuje?");
        System.out.println("Obstawiasz: 1 - Parzyste, 2 - Nieparzyste, 3 - Zero ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    private static int getBetSum() {
        System.out.println("Jaką sumę chcesz obstawić?");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    private static int genRandom() {
        Random rand = new Random();
        int valueRoulette = rand.nextInt(36);
        return valueRoulette;

    }
}
