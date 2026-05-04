package ACTIVIDAD_01;

public class Main {
    public static void main(String[] args) {

        // 1. Crear instancia del gestor de tareas
        GestorDeTareas<Tarea> gestor = new GestorDeTareas<>();

        // 2. Agregar 5 tareas con distintas prioridades y estados
        gestor.agregarTarea(new Tarea("Diseñar BD", 2, "pendiente"));
        gestor.agregarTarea(new Tarea("Deploy produccion", 1, "pendiente"));
        gestor.agregarTarea(new Tarea("Documentar API", 3, "completada"));
        gestor.agregarTarea(new Tarea("Code review", 2, "pendiente"));
        gestor.agregarTarea(new Tarea("Corregir bug #42", 1, "completada"));

        // 3. Eliminar una tarea existente
        gestor.eliminarTarea(new Tarea("Code review", 2, "pendiente"));

        // 4. Imprimir todas las tareas actuales
        System.out.println("=== Tareas actuales ===");
        gestor.imprimirTareas();

        // 5. Verificar si cierta tarea existe
        Tarea buscar = new Tarea("Deploy produccion", 1, "pendiente");
        System.out.println("\n¿Contiene 'Deploy produccion'? " + gestor.contieneTarea(buscar));

        // 6. Obtener e imprimir la tarea más prioritaria
        System.out.println("\nMas prioritaria: " + gestor.obtenerTareaMasPrioritaria());

        // 7. Invertir la lista e imprimirla
        gestor.invertirTareas();
        System.out.println("\n=== Lista invertida ===");
        gestor.imprimirTareas();

        // 8. Transferir tareas completadas a una segunda lista e imprimirla
        GestorDeTareas<Tarea> completadas = new GestorDeTareas<>();
        Node<Tarea> current = gestor.getLista().getFirst();
        while (current != null) {
            if (current.value.getEstado().equals("completada")) {
                completadas.agregarTarea(current.value);
            }
            current = current.next;
        }
        System.out.println("\n=== Tareas completadas ===");
        completadas.imprimirTareas();
    }
}