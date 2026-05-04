package EJERCICIO_05;

public class Main {

    public static void main(String[] args) {
        ListLinked<Integer> lista1 = new ListLinked<>();
        lista1.insertLast(10);
        lista1.insertLast(20);
        lista1.insertLast(30);
        lista1.insertLast(40);
        lista1.insertLast(50);

        ListLinked<Integer> lista2 = new ListLinked<>();
        lista2.insertLast(10);
        lista2.insertLast(20);
        lista2.insertLast(30);
        lista2.insertLast(40);
        lista2.insertLast(50);

        ListLinked<Integer> lista3 = new ListLinked<>();
        lista3.insertLast(10);
        lista3.insertLast(20);
        lista3.insertLast(99);
        lista3.insertLast(40);
        lista3.insertLast(50);

        ListLinked<Integer> lista4 = new ListLinked<>();
        lista4.insertLast(10);
        lista4.insertLast(20);
        lista4.insertLast(30);

        System.out.println("=== Ejercicio 5: Comparar listas ===");
        System.out.println("Lista 1: 10, 20, 30, 40, 50");
        System.out.println("Lista 2: 10, 20, 30, 40, 50");
        System.out.println("Lista 3: 10, 20, 99, 40, 50");
        System.out.println("Lista 4: 10, 20, 30");

        System.out.println("\nLista1 == Lista2: " + Ejercicio05SonIguales.sonIguales(lista1, lista2));
        System.out.println("Lista1 == Lista3: " + Ejercicio05SonIguales.sonIguales(lista1, lista3));
        System.out.println("Lista1 == Lista4: " + Ejercicio05SonIguales.sonIguales(lista1, lista4));
    }
}