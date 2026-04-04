public class Tarea {

    private String titulo;
    private boolean completada;

    public Tarea(String titulo) {
        this.titulo = titulo;
        this.completada = false;
    }

    public Tarea(String titulo, boolean completada) {
        this.titulo = titulo;
        this.completada = completada;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void marcarComoCompletada() {
        this.completada = true;
    }

    public String toFileString() {
        return titulo + ";" + completada;
    }

    @Override
    public String toString() {
        return (completada ? "[X] " : "[ ] ") + titulo;
    }
}
