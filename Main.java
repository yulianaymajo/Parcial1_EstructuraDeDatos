/**
 * Clase principal que ejecuta el programa.
 * Crea una lista de estudiantes, aplica ordenamientos, realiza búsquedas y muestra los resultados.
 */
public class Main {

    /**
     * Método para imprimir un arreglo de estudiantes en consola.
     * Ahora llama al método 'printInfo()' de cada estudiante.
     */
    public static void printStudentList(String title, Student[] students) {
        System.out.println("\n=== " + title + " ===");
        for (int i = 0; i < students.length; i++) {
            System.out.print((i + 1) + ". ");
            students[i].printInfo(); // <-- Aquí se usa el nuevo método
        }
    }

    public static void main(String[] args) {
        // Crear un conjunto de 10 estudiantes con datos coherentes
        Student[] originalStudents = {
            new Student(20, 3, 2, 8, 6, "Ingeniería de Sistemas", 101),
            new Student(22, 7, 3, 15, 2, "Derecho", 102),
            new Student(19, 2, 1, 5, 9, "Psicología", 103),
            new Student(25, 9, 4, 18, 1, "Medicina", 104),
            new Student(21, 5, 3, 12, 4, "Administración", 105),
            new Student(23, 6, 5, 14, 3, "Arquitectura", 106),
            new Student(18, 1, 2, 3, 11, "Diseño Gráfico", 107),
            new Student(24, 8, 4, 17, 2, "Contaduría", 108),
            new Student(20, 4, 3, 10, 5, "Biología", 109),
            new Student(26, 10, 6, 20, 0, "Ingeniería Civil", 110)
        };

        // Mostrar la lista original
        printStudentList("Lista Original de Estudiantes", originalStudents);

        // --- ORDENAMIENTO ---

        // 1. Insertion Sort por Edad (Ascendente)
        Student[] studentsForInsertion = originalStudents.clone(); // Clonar para no modificar el original
        SortingAlgorithms.insertionSortByAge(studentsForInsertion);
        printStudentList("Después de Insertion Sort (por Edad, Ascendente)", studentsForInsertion);

        // 2. Selection Sort por Semestre (Descendente)
        Student[] studentsForSelection = originalStudents.clone();
        SortingAlgorithms.selectionSortBySemesterDesc(studentsForSelection);
        printStudentList("Después de Selection Sort (por Semestre, Descendente)", studentsForSelection);

        // --- BÚSQUEDA ---

        System.out.println("\n" + "=".repeat(50));
        System.out.println("RESULTADOS DE BÚSQUEDA");
        System.out.println("=".repeat(50));

        // Búsqueda Lineal por programId
        int targetProgramId = 105; // Buscamos al estudiante con ID 105
        int linearResult = SearchAlgorithms.linearSearchByProgramId(originalStudents, targetProgramId);
        System.out.println("\nBúsqueda Lineal por ID de Programa: " + targetProgramId);
        if (linearResult != -1) {
            System.out.println("¡ENCONTRADO! en índice " + linearResult + ":");
            originalStudents[linearResult].printInfo(); // <-- Imprime con el nuevo método
        } else {
            System.out.println("Estudiante con ID " + targetProgramId + " NO ENCONTRADO.");
        }

        // Búsqueda Binaria por Edad
        // Primero, necesitamos un arreglo ordenado por edad. Usamos el ya ordenado por Insertion Sort.
        int targetAge = 22;
        int binaryResult = SearchAlgorithms.binarySearchByAge(studentsForInsertion, targetAge);
        System.out.println("\nBúsqueda Binaria por Edad: " + targetAge);
        if (binaryResult != -1) {
            System.out.println("¡ENCONTRADO! en índice " + binaryResult + ":");
            studentsForInsertion[binaryResult].printInfo(); // <-- Imprime con el nuevo método
        } else {
            System.out.println("Estudiante con edad " + targetAge + " NO ENCONTRADO.");
        }

        System.out.println("\nEjecución del programa completada.");
    }
}