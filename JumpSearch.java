/*
 * Jump Search is a searching algorithm for sorted arrays.
    The basic idea is to check fewer elements (than linear search)
    by jumping ahead by fixed steps or skipping some elements in place of searching all elements.
 */
package algorithms;

/**
 *
 * @author Karim Abo Agiza
 */
public class JumpSearch {

    public static int jumbSearch(int[] arr, int searchKey) {

        int len = arr.length;
        int numOfSteps = (int) Math.floor(Math.sqrt(len));

        int prev = 0;
        while (arr[Math.min(numOfSteps, len) - 1] < searchKey) {
            prev = numOfSteps;
            numOfSteps += (int) Math.floor(Math.sqrt(len));
            if (prev >= len) {
                return -1;
            }
        }

        while (arr[prev] < searchKey) {
            prev++;

            // If we reached next block or end of
            // array, element is not present.
            if (prev == Math.min(numOfSteps, len)) {
                return -1;
            }
        }

        // If element is found
        if (arr[prev] == searchKey) {
            return prev;
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 610};
        int x = 55;

        int index = jumbSearch(arr, x);

        System.out.println("\nNumber " + x + " is at index " + index);
    }

}
