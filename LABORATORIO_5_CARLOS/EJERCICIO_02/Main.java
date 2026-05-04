package EJERCICIO_02;

public class Main {

    public static void main(String[] args) {
        ListLinked<Integer> lista = new ListLinked<>();
        lista.insertLast(10);
        lista.insertLast(20);
        lista.insertLast(30);
        lista.insertLast(40);
        lista.insertLast(50);

        System.out.println("=== Ejercicio 2: Invertir lista ===");
        System.out.println("Lista original:");
        lista.print();

        ListLinked<Integer> invertida = Ejercicio02InvertirLista.invertirLista(lista);

        System.out.println("\nLista invertida:");
        invertida.print();

        System.out.println("\nLista original sin modificar:");
        lista.print();
    }
}