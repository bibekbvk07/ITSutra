package com.Bibek.Sorting;

public class QuickSort {
    public static void quickSort(int [] arr, int lowIndex, int highIndex){
        if (lowIndex >= highIndex)
            return;

        int pivot = arr[highIndex];

        int leftPointer = partition(arr, lowIndex, highIndex, pivot);

        quickSort(arr, lowIndex, leftPointer-1);
        quickSort(arr, leftPointer+1, highIndex);
    }

    // Partition methods performs divide and conquer mechanism to sort any given arrays
    private static int partition(int[] arr, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer){
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while (arr[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            Swap.swap(arr, leftPointer, rightPointer);
        }
        Swap.swap(arr, leftPointer, highIndex);
        return leftPointer;
    }
}
