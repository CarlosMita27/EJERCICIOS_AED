package EJERCICIO_01;

public class Ejercicio01BuscarElemento {

    public static <T> boolean buscarElemento(ListLinked<T> lista, T valor) {
        Node<T> current = lista.getFirst();
        while (current != null) {
            if (current.value.equals(valor)) return true;
            current = current.next;
        }
        return false;
    }
}