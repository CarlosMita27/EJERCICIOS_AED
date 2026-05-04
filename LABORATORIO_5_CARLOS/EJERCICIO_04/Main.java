package EJERCICIO_04;

public class Main {

    public static void main(String[] args) {
        Node<String> head = null;

        head = new Node<>("Manzana");
        head.next = new Node<>("Pera");
        head.next.next = new Node<>("Uva");
        head.next.next.next = new Node<>("Mango");
        head.next.next.next.next = new Node<>("Sandia");

        System.out.println("=== Ejercicio 4: Contar nodos ===");
        System.out.println("Lista actual:");
        Node<String> current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }

        System.out.println("\nTotal de nodos: " + Ejercicio04ContarNodos.contarNodos(head));
    }
}