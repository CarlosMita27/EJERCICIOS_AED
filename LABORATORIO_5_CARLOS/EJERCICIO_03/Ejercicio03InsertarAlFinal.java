package EJERCICIO_03;

public class Ejercicio03InsertarAlFinal {

    public static <T> Node<T> insertarAlFinal(Node<T> head, T valor) {
        Node<T> newNode = new Node<>(valor);
        if (head == null) {
            return newNode;
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }
}