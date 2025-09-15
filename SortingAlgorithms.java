// This class has two sorting algorithms for students.
// We only implemented Insertion Sort and Selection Sort because those were requested.

public class SortingAlgorithms {

    // Insertion Sort:
    // This method sorts the students by age from youngest to oldest.
    // It works like when you organize playing cards in your hand:
    // you take one card (a student) and insert it in the right place.
    public static void insertionSortByAge(Student[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Student key = arr[i]; // the student we are going to "insert"
            int j = i - 1;

            // While there are students older than "key", move them one position to the right
            while (j >= 0 && arr[j].age > key.age) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // Place the student in the correct position
            arr[j + 1] = key;
        }
    }

    // Selection Sort:
    // This method sorts students by semester from highest to lowest.
    // The idea is to always look for the student that should go first,
    // then the second, and so on until the array is sorted.
    public static void selectionSortBySemesterDesc(Student[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i; // we assume this one has the highest semester

            // Look through the rest to see if there’s a student with a higher semester
            for (int j = i + 1; j < n; j++) {
                if (arr[j].semester > arr[maxIndex].semester) {
                    maxIndex = j; // update if we find someone with a higher semester
                }
            }

            // Swap the student we found with the one at the current position
            Student temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
