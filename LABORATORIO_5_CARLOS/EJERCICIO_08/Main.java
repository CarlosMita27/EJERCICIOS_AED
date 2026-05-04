package EJERCICIO_08;

public class Main {

    public static void main(String[] args) {
        ColaReproduccion<Cancion> cola = new ColaReproduccion<>();

        cola.agregarCancion(new Cancion("I Want To Know What Love Is", "Foreigner", 301));
        cola.agregarCancion(new Cancion("Tren Al Sur", "Los Prisioneros", 339));
        cola.agregarCancion(new Cancion("Hotel California", "Eagles", 405));
        cola.agregarCancion(new Cancion("Wind Of Change", "Scorpions", 283));
        cola.agregarCancion(new Cancion("In The End", "Linkin Park", 219));
        cola.agregarCancion(new Cancion("Aun Estas En Mis Suenos", "Rata Blanca", 300));

        System.out.println("=== Cola de Reproduccion Inicial ===");
        cola.mostrarCola();

        System.out.println("\nAvanzando canciones:");
        System.out.println("► Siguiente: " + cola.reproducirSiguiente());
        System.out.println("► Siguiente: " + cola.reproducirSiguiente());
        System.out.println("► Siguiente: " + cola.reproducirSiguiente());

        System.out.println("\nRetrocediendo:");
        System.out.println("◄ Anterior: " + cola.reproducirAnterior());

        System.out.println("\n=== Cola actual ===");
        cola.mostrarCola();

        System.out.println("\n=== Mezclando... ===");
        cola.mezclar();
        cola.mostrarCola();

        int totalSeg = cola.duracionTotal();
        int minutos = totalSeg / 60;
        int segundos = totalSeg % 60;
        System.out.println("\nDuracion total: " + minutos + ":" + String.format("%02d", segundos));
    }
}