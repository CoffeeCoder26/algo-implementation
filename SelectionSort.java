/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

public class SelectionSort {

    private int[] arr;
    private int numOfElements;

    SelectionSort(int maxSize) {
        arr = new int[maxSize];
        this.numOfElements = 0;
    }

    void insertElemnets(int value) {
        arr[numOfElements] = value;
        numOfElements++;
    }

    void displayElements() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void sortArray() {

        for (int i = 0; i < arr.length - 1; i++) {

            int minElement = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElement]) {
                    minElement = j;

                }

            }
            int temp = arr[minElement];
            arr[minElement] = arr[i];
            arr[i] = temp;

        }
    }

    public static void main(String[] args) {
        int max = 5;
        SelectionSort selectionSort = new SelectionSort(max);
        selectionSort.insertElemnets(64);
        selectionSort.insertElemnets(7);
        selectionSort.insertElemnets(11);
        selectionSort.insertElemnets(12);
        selectionSort.insertElemnets(20);

        selectionSort.displayElements();

        selectionSort.sortArray();
        System.out.print("Array Sorted: ");
        selectionSort.displayElements();
    }

}
