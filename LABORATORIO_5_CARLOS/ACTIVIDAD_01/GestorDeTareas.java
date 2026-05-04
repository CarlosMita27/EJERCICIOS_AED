package ACTIVIDAD_01;

public class GestorDeTareas<T> {
    private ListLinked<T> lista;

    public GestorDeTareas() {
        lista = new ListLinked<>();
    }

    public void agregarTarea(T tarea) {
        lista.insertLast(tarea);
    }

    public boolean eliminarTarea(T tarea) {
        return lista.removeNode(tarea);
    }

    public boolean contieneTarea(T tarea) {
        return lista.search(tarea);
    }

    public void imprimirTareas() {
        lista.print();
    }

    public int contarTareas() {
        return lista.length();
    }

    public T obtenerTareaMasPrioritaria() {
        if (lista.isEmptyList()) return null;
        Node<T> current = lista.getFirst();
        T masPrioritaria = current.value;
        current = current.next;
        while (current != null) {
            if (current.value instanceof Comparable) {
                Comparable c1 = (Comparable) current.value;
                Comparable c2 = (Comparable) masPrioritaria;
                if (c1.compareTo(c2) < 0) {
                    masPrioritaria = current.value;
                }
            }
            current = current.next;
        }
        return masPrioritaria;
    }

    public void invertirTareas() {
        lista.reverse();
    }

    // Permite acceder a la lista interna para operaciones externas
    public ListLinked<T> getLista() {
        return lista;
    }
}