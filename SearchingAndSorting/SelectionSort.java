package SearchingAndSorting;

public class SelectionSort {
    public void sort(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            int minIndex = i;
            for (int j = i ; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap elements
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        // Print the sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
