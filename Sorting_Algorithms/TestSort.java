package com.Bibek.Sorting;

import java.util.Random;

public class TestSort {
    private static Random rand = new Random();
    public static void main(String[] args) {

        int [] arr = new int[20];

        // Generate random int [] arrrays
        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(1000);
        }

        //Array before sorted:
        System.out.println("Original Arrays: ");
        for (int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();

        // BubbleSort.bubbleSort(arr);
        //SelectionSort.selectionSort(arr);
        QuickSort.quickSort(arr, 0, arr.length-1);

        System.out.println("\nArrays after sorted: ");
        for (int num: arr)
        {
            System.out.print(num + " ");
        }

    }
}
