// This class has search algorithms to find students inside an array.

public class SearchAlgorithms {

    // Linear Search:
    // This goes through the array one by one until it finds
    // the student with the programId we’re looking for.
    // If found, it returns the index. If not, it returns -1.
    public static int linearSearchByProgramId(Student[] arr, int targetId) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].programId == targetId) {
                return i; // Found it, return the index
            }
        }
        return -1; // If we reached the end without finding it
    }

    // Binary Search:
    // This algorithm is faster, but it only works if the array is ALREADY sorted by age.
    // Instead of checking one by one, it checks the middle element,
    // and then decides whether to keep searching on the left or right half.
    public static int binarySearchByAge(Student[] arr, int targetAge) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // index of the middle element

            if (arr[mid].age == targetAge) {
                return mid; // Found the student
            }

            if (arr[mid].age < targetAge) {
                left = mid + 1; // Keep searching on the right side
            } else {
                right = mid - 1; // Keep searching on the left side
            }
        }

        return -1; // Not found
    }
}
