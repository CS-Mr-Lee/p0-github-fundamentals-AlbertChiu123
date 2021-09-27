/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.v2;

import java.util.Scanner;

/**
 *
 * @author alber_3d0phb2
 */
public class ArrayV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        // Write the list of arrays
        int[] IntList = new int[1];
        int i = 100;
        System.out.println("This program will reverse and print evry integers you enter");
            IntList [i] = keyedInput.nextInt();
            System.out.println("-"+IntList [i]);
    }
    
}
