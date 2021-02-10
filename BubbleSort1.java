/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort.pkg1;

/**
 *
 * @author YN
 */
public class BubbleSort1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {60, 40, 50, 10, 30};

        for (int i = 0; i < (arr.length - 1); i++) {
            for (int j = 0; j < (arr.length - i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
