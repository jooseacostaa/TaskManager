import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GestorTareas gestor = new GestorTareas();

        boolean salir = false;

        while (!salir) {

            mostrarMenu();
            int opcion = leerOpcion(sc);
            salir = procesarOpcion(opcion, gestor, sc);

        }

        sc.close();

    }

    public static void mostrarMenu() {

        System.out.println("""
                --- GESTOR DE TAREAS ---
                Pulse una tecla según la opción que quiera realizar
                1. Añadir tarea
                2. Ver tareas
                3. Completar tareas
                4. Eliminar tareas
                5. Salir""");

    }

    public static int leerOpcion(Scanner sc) {

        return sc.nextInt();

    }

    public static boolean procesarOpcion(int opcion, GestorTareas gestor, Scanner sc) {

        switch (opcion) {

            case 1:

                System.out.println("Introduce la tarea");
                sc.nextLine();
                String titulo = sc.nextLine();
                gestor.agregarTarea(titulo);
                System.out.println("Tarea añadida correctamente");
                break;

            case 2:
                gestor.listarTareas();
                break;

            case 3:
                gestor.listarTareas();
                System.out.println("Introduce el número de la tarea a completar");
                int indice = sc.nextInt();
                sc.nextLine();
                gestor.completarTarea(indice);
                System.out.println("Tarea completada correctamente");
                break;

            case 4:
                gestor.listarTareas();
                System.out.println("Introduce el número de la tarea a eliminar");
                int indice2 = sc.nextInt();
                sc.nextLine();
                gestor.eliminarTarea(indice2);
                System.out.println("Tarea eliminada correctamente");
                break;

            case 5:
                return true;

            default:
                System.out.println("Opción no válida");
        }

        return false;

    }

}