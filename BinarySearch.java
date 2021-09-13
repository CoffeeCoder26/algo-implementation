/*
 * Binary Search: Search a sorted array by repeatedly dividing the search interval in half. Begin with an interval covering the whole array.
If the value of the search key is less than the item in the middle of the interval, 
narrow the interval to the lower half. Otherwise, narrow it to the upper half. 
Repeatedly check until the value is found or the interval is empty.
 */
package algorithms;

/**
 *
 * @author Karim Abo Agiza
 */
public class BinarySearch {

    public int binarySearch(int[] arr, int left, int right, int searchKey) {
        int mid;

        if (right > left) {
            mid = left + (right - left) / 2;

            if (arr[mid] == searchKey) {
                return mid;
            }

            if (arr[mid] > searchKey) {
                return binarySearch(arr, left, mid - 1, searchKey);
            }

            return binarySearch(arr, mid + 1, right, searchKey);
        }

        return -1;

    }

    public static void main(String[] args) {

        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Element Not Founded");
        } else {
            System.out.println("Element Found At Index " + result);
        }
    }

}
