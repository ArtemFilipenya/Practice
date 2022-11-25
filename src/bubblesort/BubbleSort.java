package bubblesort;

public class BubbleSort {

    public int[] bubbleSort(int[] array) {
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 1; i < array.length; i++) {
                int prev = array[i - 1];
                int current = array[i];
                if (current < prev) {
                    swap(array, i - 1, i);
                    sorted = false;
                }
            }
        }
        return array;
    }

    public void swap(int[] array, int index1, int index2) {
        int buffer = array[index1];
        array[index1] = array[index2];
        array[index2] = buffer;
    }
}
