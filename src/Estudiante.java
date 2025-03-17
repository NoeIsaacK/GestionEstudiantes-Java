// Clase base Estudiante: Clase base que representa a un estudiante genérico.
public class Estudiante {
    // Atributos: cambiamos a 'protected' para que las subclases puedan acceder
    protected String nombre;
    protected int edad;
    protected double[] calificaciones;

    // Constructor
    public Estudiante(String nombre, int edad, double[] calificaciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = calificaciones;
    }

    // Método para calcular el promedio
    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    // Método para mostrar los datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + calcularPromedio());
    }

    // Método abstracto para que las subclases lo implementen
    public void tipoEstudiante() {
        System.out.println("Tipo de estudiante no especificado.");
    }
}