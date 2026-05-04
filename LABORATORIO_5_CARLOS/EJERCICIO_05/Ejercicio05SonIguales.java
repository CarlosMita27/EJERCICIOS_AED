package EJERCICIO_05;

public class Ejercicio05SonIguales {

    public static <T> boolean sonIguales(ListLinked<T> lista1, ListLinked<T> lista2) {
        Node<T> current1 = lista1.getFirst();
        Node<T> current2 = lista2.getFirst();
        while (current1 != null && current2 != null) {
            if (!current1.value.equals(current2.value)) return false;
            current1 = current1.next;
            current2 = current2.next;
        }
        return current1 == null && current2 == null;
    }
}