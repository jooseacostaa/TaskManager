import java.util.ArrayList;

public class GestorTareas {

    private ArrayList<Tarea> tareas;

    public GestorTareas() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(String titulo) {
        tareas.add(new Tarea(titulo));
    }

    public void listarTareas() {

        if (tareas.isEmpty()) {
            System.out.println("No tienes ninguna tarea pendiente");
            return;
        }

        for (int i = 0; i < tareas.size(); i += 1) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }

    }

    public boolean completarTarea(int indice) {

        if (indice < 1 || indice > tareas.size()) {
            System.out.println("El índice no es válido");
            return false;
        }

        tareas.get(indice - 1).marcarComoCompletada();
        return true;

    }

    public boolean eliminarTarea(int indice) {

        if (indice < 1 || indice > tareas.size()) {
            System.out.println("El índice no es válido");
            return false;
        }

        tareas.remove(indice - 1);
        return true;

    }

}
