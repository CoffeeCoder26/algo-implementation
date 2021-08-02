/*
 * Kareem Abo Agiza
 * Insertion Sort Algoritm
 * 
 */
package algorithms;

public class InsertionSort {

    private final int[] arr;
    private int nElements;

    public InsertionSort(int maxElements) {
        arr = new int[maxElements];
        nElements = 0;
    }

    public void insertElements(int value) {
        arr[nElements] = value;
        nElements++;
    }

    public void displayArrayElements() {
        for (int i = 0; i < nElements; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    void sortArray() {
        for (int i = 0; i < arr.length; i++) {

            int keyElement = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > keyElement) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = keyElement;
        }
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort(5);
        insertionSort.insertElements(12);
        insertionSort.insertElements(11);
        insertionSort.insertElements(13);
        insertionSort.insertElements(5);
        insertionSort.insertElements(6);
        
        insertionSort.displayArrayElements();
        System.out.print("Sorted Array: ");
        insertionSort.sortArray();
        insertionSort.displayArrayElements();

                

    }

}
