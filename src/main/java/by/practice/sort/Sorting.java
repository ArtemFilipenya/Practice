package by.practice.sort;

/**
 *      Сортировка пузырьком.
 * Алгоритм просматривает массив и сравнивает каждую пару соседних элементов.
 * Когда он встречает пару элементов, расположенных не по порядку, происходит
 * замена двух элементов местами.
 */

public class Sorting {

    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
