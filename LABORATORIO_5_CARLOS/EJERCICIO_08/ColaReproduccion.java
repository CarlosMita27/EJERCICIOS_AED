package EJERCICIO_08;

import java.util.ArrayList;
import java.util.Random;

public class ColaReproduccion<T> {
    private NodeDoble<T> head;
    private NodeDoble<T> tail;
    private NodeDoble<T> actual;

    public ColaReproduccion() {
        head = null;
        tail = null;
        actual = null;
    }

    public void agregarCancion(T cancion) {
        NodeDoble<T> newNode = new NodeDoble<>(cancion);
        if (head == null) {
            head = newNode;
            tail = newNode;
            actual = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public T reproducirSiguiente() {
        if (actual == null || actual.next == null) {
            System.out.println("No hay siguiente cancion.");
            return null;
        }
        actual = actual.next;
        return actual.value;
    }

    public T reproducirAnterior() {
        if (actual == null || actual.prev == null) {
            System.out.println("No hay cancion anterior.");
            return null;
        }
        actual = actual.prev;
        return actual.value;
    }

    public void mezclar() {
        ArrayList<T> valores = new ArrayList<>();
        NodeDoble<T> current = head;
        while (current != null) {
            valores.add(current.value);
            current = current.next;
        }
        Random rand = new Random();
        for (int i = valores.size() - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            T temp = valores.get(i);
            valores.set(i, valores.get(j));
            valores.set(j, temp);
        }
        current = head;
        for (T valor : valores) {
            current.value = valor;
            current = current.next;
        }
        actual = head;
    }

    public void mostrarCola() {
        NodeDoble<T> current = head;
        int i = 1;
        while (current != null) {
            if (current == actual) {
                System.out.println("► " + i + ". " + current.value + " (reproduciendo ahora)");
            } else {
                System.out.println("  " + i + ". " + current.value);
            }
            i++;
            current = current.next;
        }
    }

    public int duracionTotal() {
        int total = 0;
        NodeDoble<T> current = head;
        while (current != null) {
            if (current.value instanceof Cancion) {
                total += ((Cancion) current.value).getDuracionSeg();
            }
            current = current.next;
        }
        return total;
    }
}