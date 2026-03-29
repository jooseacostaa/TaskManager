import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    }

    public static void mostrarMenu() {

        System.out.println("--- GESTOR DE TAREAS ---" + "\n" +
                "Pulse una tecla según la opción que quiera realizar" + "\n" +
                "1. Añadir tarea" + "\n" +
                "2. Ver tareas" + "\n" +
                "3. Completar tareas" + "\n" +
                "4 Eliminar tareas" + "\n" +
                "5. Salir");

    }

    public static int leerOpcion() {

        Scanner sc = new Scanner(System.in);
        int opcion;
        opcion = sc.nextInt();
        return opcion;

    }

    public static boolean procesarOpcion() {

        if (leerOpcion() != 1
                || leerOpcion() != 2
                || leerOpcion() != 3
                || leerOpcion() != 4
                || leerOpcion() != 5) {
            return false;
        } else {
            return true;
        }

    }

}