package ACTIVIDAD_01;

public class Tarea implements Comparable<Tarea> {
    private String titulo;
    private int prioridad;
    private String estado;

    public Tarea(String titulo, int prioridad, String estado) {
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.estado = estado;
    }

    public String getTitulo() { return titulo; }
    public int getPrioridad() { return prioridad; }
    public String getEstado() { return estado; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setPrioridad(int prioridad) { this.prioridad = prioridad; }
    public void setEstado(String estado) { this.estado = estado; }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tarea otra = (Tarea) obj;
        return this.prioridad == otra.prioridad
            && this.titulo.equals(otra.titulo)
            && this.estado.equals(otra.estado);
    }
    @Override
    public int compareTo(Tarea otra) {
        return Integer.compare(this.prioridad, otra.prioridad);
    }

    @Override
    public String toString() {
        return "[" + titulo + " | Prioridad: " + prioridad + " | Estado: " + estado + "]";
    }
}