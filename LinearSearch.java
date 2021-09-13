/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author Karim Abo Agiza
 */
public class LinearSearch {

    public static int Search(int[] arr, int x) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{20,5,7,10,4,2};
       
        int x = 0;

        int res = Search(arr, x);

        if (res == -1) {
            System.out.println("Elemnet Is Not Founded ....");
        } else {
            System.out.println("Element Founded at index " + res);
        }
    }

}
