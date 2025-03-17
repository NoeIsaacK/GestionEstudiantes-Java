// Subclase EstudianteSecundario: Subclase que representa a un estudiante de secundaria //
// con atributos específicos como el grado.//
public class EstudianteSecundario extends Estudiante {
    private int grado;

    // Constructor
    public EstudianteSecundario(String nombre, int edad, double[] calificaciones, int grado) {
        super(nombre, edad, calificaciones); // Llamamos al constructor de la clase base
        this.grado = grado;
    }

    // Sobrescribir el método tipoEstudiante
    @Override
    public void tipoEstudiante() {
        System.out.println("Soy un estudiante de secundaria.");
    }

    // Método exclusivo de esta subclase
    public void mostrarGrado() {
        System.out.println("Grado: " + grado);
    }
}