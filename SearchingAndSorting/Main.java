import SearchingAndSorting.*;

public class Main {
    public static void main(String[] args) {
      int[] array = {4,9,1,5,3};
        int[] Array = {3,5,7,9,10,15,14,20};
        BubbleSort sort = new BubbleSort();
        sort.sort();
        SelectionSort selection = new SelectionSort();
        selection.sort(array);
        InsertionSort insert = new InsertionSort();
        insert.Sort(array);
        BinarySearch binary = new BinarySearch();
        binary.search(Array,11);
        binary.nonRec(Array,4);
        MergeSort merge = new MergeSort();
        merge.Sort(array);

        StringManipilation count = new StringManipilation();
        count.CountingVowels("Hinderson");
        count.StringReversal("Bungle in the jungle");
        count.StringReversal2("Klaus");
        count.WordReversal("Elijha Michaelson");
        System.out.println(count.Palindrome("radar"));
        System.out.println(count.isAnagramUsingSorting("synaps","ysnaps"));

    }
}
