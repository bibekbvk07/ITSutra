package LearnJava.Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int [] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++){
            int minIdx = i;
            for (int j = i+1; j < n; j++){
                if (arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }
            // Swapping is done at outer loop in Selection sort
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

            System.out.println();
            for (int num: arr) {
                System.out.print( num+ " ");
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {2,7,10,18,0};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
    }
}
