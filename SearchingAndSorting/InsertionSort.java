package SearchingAndSorting;

public class InsertionSort {
    public void Sort(int[] array){
        for (int i = 1 ; i<array.length;i++){
            int current = array[i];
            int j = i-1;
            while(j>=0 && array[j] > current){
                array[j+1] = array[j];
                j--;
            }
            array[j+1]= current;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
