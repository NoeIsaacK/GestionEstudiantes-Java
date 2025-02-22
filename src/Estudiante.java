// Clase Estudiante: Representa a un estudiante con nombre, edad y calificaciones.
public class Estudiante {
    // Atributos
    private String nombre; // Atributo nombre: Almacena el nombre del estudiante.
    private int edad; // Atributo edad: Almacena la edad del estudiante.
    private double[] calificaciones; // Atributo calificaciones: Almacena las calificaciones del estudiante.

    // Constructor: Inicializa los atributos del estudiante.
    public Estudiante(String nombre, int edad, double[] calificaciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = calificaciones;
    }

    // Método para calcular el promedio : Calcula el promedio de las calificaciones del estudiante.
    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    // Método para mostrar los datos: Imprime los datos del estudiante.
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + calcularPromedio());
    }
}