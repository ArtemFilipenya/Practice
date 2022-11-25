package bubblesort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = new int[]{5, -5, 100, 34, 762, 17};

        System.out.println(Arrays.toString(bubbleSort.bubbleSort(array)));
    }
}
