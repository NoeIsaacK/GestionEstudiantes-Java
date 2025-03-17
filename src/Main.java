public class Main { // Clase Main: Punto de entrada de la aplicación.
    public static void main(String[] args) { // Clase Main: Punto de entrada de la aplicación.

        // Crear un arreglo de calificaciones: Define un conjunto de calificaciones para el estudiante.
        double[] calificaciones1 = {8.5, 9.0, 7.5};
        double[] calificaciones2 = {6.0, 7.0, 8.0};

        // Instanciar un objeto EstudianteUniversitario:
        EstudianteUniversitario estudianteUni = new EstudianteUniversitario("Ana López", 22, calificaciones1, "Ingeniería");
        estudianteUni.mostrarDatos();
        estudianteUni.tipoEstudiante();
        estudianteUni.mostrarCarrera();

        System.out.println(); // Salto de línea para separar resultados

        // Instanciar un objeto EstudianteSecundario
        EstudianteSecundario estudianteSec = new EstudianteSecundario("Carlos Pérez", 16, calificaciones2, 10);
        estudianteSec.mostrarDatos();
        estudianteSec.tipoEstudiante();
        estudianteSec.mostrarGrado();
    }
}