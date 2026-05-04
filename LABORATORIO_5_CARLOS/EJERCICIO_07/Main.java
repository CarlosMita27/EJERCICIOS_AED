package EJERCICIO_07;

public class Main {

    public static void main(String[] args) {
        SortedListLinked<Tarea> lista = new SortedListLinked<>();

        Tarea t1 = new Tarea("Documentar API", 3, "pendiente");
        Tarea t2 = new Tarea("Corregir bug #42", 1, "pendiente");
        Tarea t3 = new Tarea("Code review", 2, "pendiente");
        Tarea t4 = new Tarea("Deploy produccion", 1, "pendiente");
        Tarea t5 = new Tarea("Diseñar BD", 2, "pendiente");

        System.out.println("=== Ejercicio 7: Lista ordenada por prioridad ===");
        System.out.println("Orden de insercion:");
        System.out.println("1. " + t1);
        System.out.println("2. " + t2);
        System.out.println("3. " + t3);
        System.out.println("4. " + t4);
        System.out.println("5. " + t5);

        lista.insertOrden(t1);
        lista.insertOrden(t2);
        lista.insertOrden(t3);
        lista.insertOrden(t4);
        lista.insertOrden(t5);

        System.out.println("\nLista ordenada automaticamente por prioridad:");
        lista.print();
    }
}