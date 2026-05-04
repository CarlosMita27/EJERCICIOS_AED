package EJERCICIO_04;

public class Ejercicio04ContarNodos {

    public static <T> int contarNodos(Node<T> head) {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}