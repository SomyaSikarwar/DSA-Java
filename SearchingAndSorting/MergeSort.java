package SearchingAndSorting;

import java.sql.SQLOutput;

public class MergeSort {

    public void Sort(int[] array){

        if (array.length <= 1) {
            return; // Already sorted
        }

        int middle = array.length /2;
        int[] left = new int[middle];
        for(int i = 0 ; i < middle ; i++){
            left[i] = array[i];
        }
        int[] right = new int[array.length - middle ];
        for(int i = middle ; i < array.length ; i++){
            right[i-middle] = array[i];
        }

        Sort(left);
        Sort(right);
        merge(left,right,array);

        for(int i = 0 ; i < array.length ; i++){
            System.out.print( array[i]+" ");
        }
        System.out.println();
    }

    private void merge(int[] left , int[] right , int[] array){
        int i =0 , j=0, k=0;

        while(i < left.length  && j < right.length ){
            if(left[i] >= right[j])
                array[k++]=right[j++] ;
            else
                array[k++]= left[i++];
        }
        while(i<left.length )
            array[k++]=left[i++];

        while(j<right.length)
            array[k++]=right[j++];
    }
}
