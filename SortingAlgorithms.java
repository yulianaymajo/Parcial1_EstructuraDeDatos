/**
 * Clase utilitaria que contiene implementaciones de algoritmos de ordenamiento.
 * Solo se incluyen Insertion Sort y Selection Sort, según lo solicitado.
 */
public class SortingAlgorithms {

    /**
     * Algoritmo Insertion Sort.
     * Ordena un arreglo de estudiantes por edad (age) de MENOR a MAYOR.
     * Funciona construyendo una lista ordenada, insertando un elemento a la vez.
     */
    public static void insertionSortByAge(Student[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Student key = arr[i];
            int j = i - 1;

            // Mueve los elementos mayores que 'key' una posición adelante
            while (j >= 0 && arr[j].age > key.age) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /**
     * Algoritmo Selection Sort.
     * Ordena un arreglo de estudiantes por semestre (semester) de MAYOR a MENOR.
     * Encuentra el elemento más grande en el subarreglo no ordenado y lo coloca al principio.
     */
    public static void selectionSortBySemesterDesc(Student[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            // Encuentra el índice del elemento con el semestre MÁXIMO en el resto del arreglo
            for (int j = i + 1; j < n; j++) {
                if (arr[j].semester > arr[maxIndex].semester) { // '>' para orden descendente
                    maxIndex = j;
                }
            }

            // Intercambia el elemento encontrado con el primer elemento del subarreglo no ordenado
            Student temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }
}