/*
    Linear Search finds the element in O(n) time, Jump Search takes O(√ n) time and Binary Search take O(Log n) time. 
    The Interpolation Search is an improvement over Binary Search for instances, where the values in a sorted array are uniformly distributed.
    Binary Search always goes to the middle element to check. 
    On the other hand, interpolation search may go to different locations according to the value of the key being searched. For example, 
    if the value of the key is closer to the last element, interpolation search is likely to start search toward the end side.
 */
package algorithms;

/**
 *
 * @author Karim Abo Agiza
 */
public class InterpolationSearch {

    public static int interpolationSearch(int arr[], int low, int high, int searchKey) {

        int position;

        if (low <= high && searchKey >= arr[low] && searchKey <= arr[high]) {

            position = low + (((high - low) / (arr[high] - arr[low])) * (searchKey - arr[low]));

            if (arr[position] == searchKey) {
                return position;
            }

            if (arr[position] < searchKey) {
                return interpolationSearch(arr, position + 1, high, searchKey);
            }

            if (arr[position] > searchKey) {
                return interpolationSearch(arr, low, position - 1, searchKey);
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int arr[] = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};

        int n = arr.length;

        int x = 42;
        int index = interpolationSearch(arr, 0, n - 1, x);

        if (index != -1) {
            System.out.println("Element found at index  " + index);
        } else {
            System.out.println("Element not found.");
        }
    }

}
