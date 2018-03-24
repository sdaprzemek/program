package pl.sdacademy.TeacherPackage;

import java.util.LinkedList;

public class ListTest {

    public static void main(String[] args) {
        ListaJednokierunkowa<Integer> lista = new ListaJednokierunkowa<>();
        lista.add(123);
        lista.add(3);
        lista.add(8);

        System.out.println(lista);

    }
}
