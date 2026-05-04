package EJERCICIO_01;

public class Main {

    public static void main(String[] args) {
        ListLinked<String> lista = new ListLinked<>();
        lista.insertLast("Tarea A");
        lista.insertLast("Tarea B");
        lista.insertLast("Tarea C");
        lista.insertLast("Tarea D");

        System.out.println("=== Ejercicio 1: Buscar elemento ===");
        System.out.println("Lista actual:");
        lista.print();

        System.out.println("\nBuscar 'Tarea B': " + Ejercicio01BuscarElemento.buscarElemento(lista, "Tarea B"));
        System.out.println("Buscar 'Tarea Z': " + Ejercicio01BuscarElemento.buscarElemento(lista, "Tarea Z"));
    }
}