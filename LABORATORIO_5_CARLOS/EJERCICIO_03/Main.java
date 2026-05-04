package EJERCICIO_03;

public class Main {

    public static void main(String[] args) {
        Node<String> head = null;

        head = Ejercicio03InsertarAlFinal.insertarAlFinal(head, "Lunes");
        head = Ejercicio03InsertarAlFinal.insertarAlFinal(head, "Martes");
        head = Ejercicio03InsertarAlFinal.insertarAlFinal(head, "Miercoles");
        head = Ejercicio03InsertarAlFinal.insertarAlFinal(head, "Jueves");
        head = Ejercicio03InsertarAlFinal.insertarAlFinal(head, "Viernes");

        System.out.println("=== Ejercicio 3: Insertar al final ===");
        System.out.println("Lista resultante:");
        Node<String> current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}