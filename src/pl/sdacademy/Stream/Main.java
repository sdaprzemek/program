package pl.sdacademy.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //Zad1
        List <Car> carList = new ArrayList <>();
        carList.add(new Car("Fiat", "Stilo", "Żółty", 170));
        carList.add(new Car("Fiat", "Multipla", "Czarny", 150));
        carList.add(new Car("Volvo", "S80", "Niebieski", 200));
        carList.add(new Car("Renault", "Megane", "Niebieski", 175));
        carList.add(new Car("Mercedes", "A", "Czerwony", 160));
        carList.add(new Car("Volvo", "S40", "Czarny", 170));
        carList.add(new Car("Dacia", "Logan", "Czarny", 165));

        Map <String, String> newMap = carList.stream()
                .filter(car -> car.getPredkosc().equals(160))
                .filter(car -> car.getKolor()!= "Czarny")
                .filter(car -> car.getMarka().contains("a"))
                .sorted(Comparator.comparing(Car::getModel))
                .collect(Collectors.toMap(k -> k.getMarka(), v -> v.getKolor()));

        System.out.println(newMap);

        //Zad2
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        System.out.println(cal.getMaximum(Calendar.DAY_OF_MONTH));

        List <String> months =
                Arrays.asList("Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec",
                        "Lipiec", "Sierpień", "Wrzesień", "Paździenrik", "Listopad", "Grudzień");

        months.stream()
                .map(e -> new Month(e))
                .sorted(Comparator.comparing(Month::getName))
                .filter(e -> e.getName().contains("r"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        /*
        Zrobić kolekcję miesiecy jako stringi
        skonwertować do obiektu miesiac (nazwa, ilosc dni)
        posortowac wzgledem ilosci dni
        odfiltrowac tylko te z litera r
        */

    }
}
