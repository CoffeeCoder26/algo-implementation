/*
 * Kareem Abo Agiza
 * Bubble Sort Algoritm
 * 
 */
package algorithms;
public class BubbleSort {

    private final int[] arr;
    private int nElements;

    public BubbleSort(int maxElements) {
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

    void bubbleSort() {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int arrTemp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = arrTemp;

                }
            }
        }
    }

    void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arraySize = 8;
        BubbleSort BS = new BubbleSort(arraySize);
        System.out.print("Array Elements: ");
        BS.insertElements(10);
        BS.insertElements(40);
        BS.insertElements(60);
        BS.insertElements(52);
        BS.insertElements(67);
        BS.insertElements(15);
        BS.insertElements(19);
        BS.insertElements(20);

        BS.displayArrayElements();
        BS.bubbleSort();
        System.out.print("Array Sort: ");
        BS.printArray();
        System.out.println();

 
    }

}
