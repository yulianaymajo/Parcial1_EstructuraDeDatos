// This class represents a university student.
// The attributes are public just to make it simpler to use .

public class Student {
    // Variables that describe a student 
    int age; // Student’s age
    int semester; // Current semester
    int socioEconomicStratum; // Socioeconomic level ( from 1 to 6)
    int coursesCompleted; // Number of courses already completed
    int coursesPending; // Number of courses still pending
    String program; // Name of the academic program or major
    int programId; // ID code of the program

    // Constructor: used to create a new student with all their information
    public Student(int age, int semester, int stratum, int completed, int pending, String program, int programId) {
        this.age = age;
        this.semester = semester;
        this.socioEconomicStratum = stratum;
        this.coursesCompleted = completed;
        this.coursesPending = pending;
        this.program = program;
        this.programId = programId;
    }

    // This method prints all the student’s information to the console.
    // the data directly to System.out.println.
    public void printInfo() {
        System.out.println(
            "Student{Age: " + age +
            ", Semester: " + semester +
            ", Stratum: " + socioEconomicStratum +
            ", Completed: " + coursesCompleted +
            ", Pending: " + coursesPending +
            ", Program: '" + program + '\'' +
            ", ID: " + programId + '}'
        );
    }
}
