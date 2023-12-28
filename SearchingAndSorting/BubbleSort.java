package SearchingAndSorting;
import java.util.Scanner;

public class BubbleSort {
    private int n;
    int[] array = new int[10];
    public void Array() {
        System.out.println("Enter the number of elements in array:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
    }

    public void Outarray(){
        for(int i = 0 ; i < n ; i++){
            System.out.print(" "+ array[i]);
        }
    }


    public void sort() {
            Array();
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            Outarray();
        }


}
