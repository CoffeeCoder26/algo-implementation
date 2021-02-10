/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection.sort.pkg2;

/**
 *
 * @author YN
 */
public class SelectionSort2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] arr = {60, 40, 50, 10, 30};

        int max;
        //(arr.length - 1) : beacuse the last element is already sorted
        for (int i = 0; i < (arr.length - 1); i++) {

            max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }

            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
