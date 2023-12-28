package SearchingAndSorting;

public class BinarySearch {

    public void search(int[] array, int target) {
        search(array, target, 0, array.length - 1);
    }

    private void search(int[] array, int target, int start, int end) {
        if (start > end) {
            System.out.println("Element not found");
            return;
        }

        int mid = (start + end) / 2;

        if (array[mid] == target) {
            System.out.println("Element found at index: " + mid);
        } else if (array[mid] > target) {
            search(array, target, start, mid - 1);
        } else {
            search(array, target, mid + 1, end);
        }
    }

    public void nonRec(int[] array,int target){
        int high = array.length-1;
        int low = 0;

        while(high >= low){
            int mid = (high + low)/2;

            if (array[mid] == target) {
                System.out.println("Element found at index: " + mid);
                break;
            }
            if(array[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            if (low > high) {
                System.out.println("Element not found");
                return;
            }

        }

    }

}
