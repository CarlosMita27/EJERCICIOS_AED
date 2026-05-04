package EJERCICIO_06;

public class Main {

    public static void main(String[] args) {
        ListLinked<String> lista1 = new ListLinked<>();
        lista1.insertLast("Lunes");
        lista1.insertLast("Martes");
        lista1.insertLast("Miercoles");

        ListLinked<String> lista2 = new ListLinked<>();
        lista2.insertLast("Jueves");
        lista2.insertLast("Viernes");
        lista2.insertLast("Sabado");
        lista2.insertLast("Domingo");

        System.out.println("=== Ejercicio 6: Concatenar listas ===");
        System.out.println("Lista 1 (3 elementos):");
        lista1.print();
        System.out.println("\nLista 2 (4 elementos):");
        lista2.print();

        ListLinked<String> resultado = Ejercicio06ConcatenarListas.concatenarListas(lista1, lista2);

        System.out.println("\nLista concatenada (7 elementos):");
        resultado.print();

        System.out.println("\nLista 1 sin modificar:");
        lista1.print();
        System.out.println("\nLista 2 sin modificar:");
        lista2.print();
    }
}