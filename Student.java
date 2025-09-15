/**
 * Clase que representa a un estudiante de la universidad.
 * Atributos públicos para simplificar el acceso (solo para fines educativos).
 */
public class Student {
    // Atributos simplificados (sin 'private')
    int age; // Edad del estudiante
    int semester; // Semestre actual
    int socioEconomicStratum; // Estrato socioeconómico (1-6)
    int coursesCompleted; // Materias cursadas
    int coursesPending; // Materias pendientes
    String program; // Nombre del programa académico
    int programId; // Código del programa

    /**
     * Constructor para inicializar un nuevo estudiante.
     */
    public Student(int age, int semester, int stratum, int completed, int pending, String program, int programId) {
        this.age = age;
        this.semester = semester;
        this.socioEconomicStratum = stratum;
        this.coursesCompleted = completed;
        this.coursesPending = pending;
        this.program = program;
        this.programId = programId;
    }

    /**
     * Método que imprime directamente la información del estudiante en la consola.
     * Reemplaza al método 'toString()'.
     */
    public void printInfo() {
        System.out.println(
            "Student{Edad: " + age +
            ", Semestre: " + semester +
            ", Estrato: " + socioEconomicStratum +
            ", Cursadas: " + coursesCompleted +
            ", Pendientes: " + coursesPending +
            ", Programa: '" + program + '\'' +
            ", ID: " + programId + '}'
        );
    }
}