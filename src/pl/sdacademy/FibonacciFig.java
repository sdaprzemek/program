package pl.sdacademy;

public class FibonacciFig {

    private static int fibonacci(int i) {
        //TODO
        int fib1 = 0;
        int fib2 = 1;
        int fib3 = 1;

        for(int n=0; n < i; n++) {
            fib1 = fib2;
            fib2 = fib3;
            fib3 = fib2 + fib1;
        }
        return fib1;
    }

    public static void main(String[] args) {
        //TODO pobierz indeks elementu ciagu
        int i = 2;
        int result;

        result = fibonacci(i);
        System.out.println(result);

        //TODO wywołaj funkcje fibonacci i wyswietl wynik
    }
}
