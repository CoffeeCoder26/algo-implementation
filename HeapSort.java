/*
 * A heap sort uses a binary heap. It first adds all the elements to a heap and then 
    removes the largest elements successively to obtain a sorted list
 */
package algorithms;

/**
 *
 * @author Kareem
 *
 */
public class HeapSort {

    public void sort(int arr[]) {
        int n = arr.length;

        // Build heap 
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {
        int largest = i;  // Initialize largest as root
        int leftChildIndex = 2 * i + 1;  // left = 2*i + 1
        int rightChildIndex = 2 * i + 2;  // right = 2*i + 2

        // If left child is larger than root
        if (leftChildIndex < n && arr[leftChildIndex] > arr[largest]) {
            largest = leftChildIndex;
        }

        // If right child is larger than largest so far
        if (rightChildIndex < n && arr[rightChildIndex] > arr[largest]) {
            largest = rightChildIndex;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {12, 11, 13, 5, 6, 7};
        //int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);

    }

}
