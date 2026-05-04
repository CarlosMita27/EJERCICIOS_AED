package EJERCICIO_07;

public class SortedListLinked<T extends Comparable<T>> extends ListLinked<T> {

    public void insertOrden(T x) {
        Node<T> newNode = new Node<>(x);
        if (isEmptyList() || x.compareTo(getFirst().value) <= 0) {
            newNode.next = getFirst();
            setFirst(newNode);
            return;
        }
        Node<T> current = getFirst();
        while (current.next != null && current.next.value.compareTo(x) <= 0) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
}