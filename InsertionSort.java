/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author YN
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = {80, 90, 60, 50, 30, 70};

        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int CurrentElement = arr[i];

            while (j >= 0 && arr[j] > CurrentElement) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = CurrentElement;

        }
        for (int i = 1; i < arr.length; i++)
        System.out.print(arr[i] + " ");

    }

}
