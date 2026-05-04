package EJERCICIO_06;

public class Ejercicio06ConcatenarListas {

    public static <T> ListLinked<T> concatenarListas(ListLinked<T> lista1, ListLinked<T> lista2) {
        ListLinked<T> resultado = new ListLinked<>();
        Node<T> current = lista1.getFirst();
        while (current != null) {
            resultado.insertLast(current.value);
            current = current.next;
        }
        current = lista2.getFirst();
        while (current != null) {
            resultado.insertLast(current.value);
            current = current.next;
        }
        return resultado;
    }
}