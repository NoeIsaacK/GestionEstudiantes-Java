//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main { // Clase Main: Punto de entrada de la aplicación.
    public static void main(String[] args) { // Clase Main: Punto de entrada de la aplicación.

        // Crear un arreglo de calificaciones: Define un conjunto de calificaciones para el estudiante.
        double[] calificaciones = {8.5, 9.0, 7.5};

        // Instanciar un objeto Estudiante:
        // Crea un nuevo objeto de la clase Estudiante con nombre, edad y calificaciones.
        Estudiante estudiante1 = new Estudiante("Juan Pérez", 20, calificaciones);

        // Mostrar los datos del estudiante:
        // Llama al método mostrarDatos() del objeto estudiante1 para imprimir su información.
        estudiante1.mostrarDatos();
    }
}