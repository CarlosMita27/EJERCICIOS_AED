package EJERCICIO_02;

public class Ejercicio02InvertirLista {

    public static <T> ListLinked<T> invertirLista(ListLinked<T> lista) {
        ListLinked<T> listaInvertida = new ListLinked<>();
        Node<T> current = lista.getFirst();
        while (current != null) {
            listaInvertida.insertFirst(current.value);
            current = current.next;
        }
        return listaInvertida;
    }
}