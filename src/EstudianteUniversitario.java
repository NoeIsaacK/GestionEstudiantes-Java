// Subclase EstudianteUniversitario: Subclase que representa a un estudiante universitario //
// con atributos específicos como la carrera.//
public class EstudianteUniversitario extends Estudiante {
    private String carrera;

    // Constructor
    public EstudianteUniversitario(String nombre, int edad, double[] calificaciones, String carrera) {
        super(nombre, edad, calificaciones); // Llamamos al constructor de la clase base
        this.carrera = carrera;
    }

    // Sobrescribir el método tipoEstudiante
    @Override
    public void tipoEstudiante() {
        System.out.println("Soy un estudiante universitario.");
    }

    // Método exclusivo de esta subclase
    public void mostrarCarrera() {
        System.out.println("Carrera: " + carrera);
    }
}