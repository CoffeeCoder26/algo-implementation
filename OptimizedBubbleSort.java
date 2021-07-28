/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

public class OptimizedBubbleSort {

    static void bubbleSort(int[] arr, int ArraySize) {
        boolean isSwapped;

        for (int i = 0; i < ArraySize - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < ArraySize - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int arrTemp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = arrTemp;
                    isSwapped = true;
                }
            }
            
            if(isSwapped==false)
                break;

        }

    }
    
    static void printArray(int[] arr, int ArraySize){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");   
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        bubbleSort(arr,  arr.length);
        System.out.println("Sorted array: ");
        printArray(arr,  arr.length);
    }

}
