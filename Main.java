//// This is the main class that runs the whole program.
// Here we create students, sort them, search for them, and print the results.

public class Main {

    // This method prints a list of students to the console.
    // It takes a title and an array of students, then shows each one using printInfo().
    public static void printStudentList(String title, Student[] students) {
        System.out.println("\n=== " + title + " ===");
        for (int i = 0; i < students.length; i++) {
            System.out.print((i + 1) + ". ");
            students[i].printInfo(); // We call the method that prints the student’s info
        }
    }

    public static void main(String[] args) {
        // Create 10 students with sample data
        Student[] originalStudents = {
            new Student(20, 3, 2, 8, 6, "Systems Engineering", 101),
            new Student(22, 7, 3, 15, 2, "Law", 102),
            new Student(19, 2, 1, 5, 9, "Psychology", 103),
            new Student(25, 9, 4, 18, 1, "Medicine", 104),
            new Student(21, 5, 3, 12, 4, "Business Administration", 105),
            new Student(23, 6, 5, 14, 3, "Architecture", 106),
            new Student(18, 1, 2, 3, 11, "Graphic Design", 107),
            new Student(24, 8, 4, 17, 2, "Accounting", 108),
            new Student(20, 4, 3, 10, 5, "Biology", 109),
            new Student(26, 10, 6, 20, 0, "Civil Engineering", 110)
        };

        // Print the original list before sorting
        printStudentList("Original List of Students", originalStudents);

        // --- SORTING ---

        // 1. Use Insertion Sort to sort students by age (ascending).
        // Clone the array so we don’t change the original.
        Student[] studentsForInsertion = originalStudents.clone();
        SortingAlgorithms.insertionSortByAge(studentsForInsertion);
        printStudentList("After Insertion Sort (by Age, Ascending)", studentsForInsertion);

        // 2. Use Selection Sort to sort students by semester (descending).
        Student[] studentsForSelection = originalStudents.clone();
        SortingAlgorithms.selectionSortBySemesterDesc(studentsForSelection);
        printStudentList("After Selection Sort (by Semester, Descending)", studentsForSelection);

        // --- SEARCHING ---
        System.out.println("\n" + "=".repeat(50));
        System.out.println("SEARCH RESULTS");
        System.out.println("=".repeat(50));

        // Linear Search: look for the student with programId = 105
        int targetProgramId = 105;
        int linearResult = SearchAlgorithms.linearSearchByProgramId(originalStudents, targetProgramId);
        System.out.println("\nLinear Search by Program ID: " + targetProgramId);
        if (linearResult != -1) {
            System.out.println("FOUND at index " + linearResult + ":");
            originalStudents[linearResult].printInfo();
        } else {
            System.out.println("Student with Program ID " + targetProgramId + " NOT FOUND.");
        }

        // Binary Search: look for a student with age = 22.
        // For this we use the array already sorted by age with Insertion Sort.
        int targetAge = 22;
        int binaryResult = SearchAlgorithms.binarySearchByAge(studentsForInsertion, targetAge);
        System.out.println("\nBinary Search by Age: " + targetAge);
        if (binaryResult != -1) {
            System.out.println("FOUND at index " + binaryResult + ":");
            studentsForInsertion[binaryResult].printInfo();
        } else {
            System.out.println("Student with age " + targetAge + " NOT FOUND.");
        }

        // Final message when everything is done
        System.out.println("\nProgram execution completed.");
    }
}
