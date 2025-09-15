/**
 * Clase utilitaria que contiene implementaciones de algoritmos de búsqueda.
 */
public class SearchAlgorithms {

    /**
     * Algoritmo de Búsqueda Lineal (Linear Search).
     * Busca un estudiante en un arreglo por su programId.
     * Recorre el arreglo elemento por elemento hasta encontrarlo o llegar al final.
     * @param arr El arreglo de estudiantes.
     * @param targetId El ID del programa que se busca.
     * @return El índice del estudiante encontrado, o -1 si no se encuentra.
     */
    public static int linearSearchByProgramId(Student[] arr, int targetId) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].programId == targetId) {
                return i; // Retorna el índice si se encuentra
            }
        }
        return -1; // Retorna -1 si no se encuentra
    }

    /**
     * Algoritmo de Búsqueda Binaria (Binary Search).
     * Busca un estudiante en un arreglo ORDENADO por edad (age).
     * Divide el arreglo a la mitad en cada paso para encontrar el objetivo.
     * @param arr El arreglo de estudiantes (DEBE estar ordenado por edad).
     * @param targetAge La edad que se busca.
     * @return El índice del estudiante encontrado, o -1 si no se encuentra.
     */
    public static int binarySearchByAge(Student[] arr, int targetAge) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid].age == targetAge) {
                return mid; // Elemento encontrado
            }

            if (arr[mid].age < targetAge) {
                left = mid + 1; // Busca en la mitad derecha
            } else {
                right = mid - 1; // Busca en la mitad izquierda
            }
        }

        return -1; // Elemento no encontrado
    }
}