/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.v1;
import java.util.*;
/**
 *
 * @author alber_3d0phb2
 */
public class ArrayV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        // Write the list of arrays
        int[] IntList = new int[14];
        System.out.println("This program will reverse and print evry 14 integers you enter");
        for(int i = 0;i < 14;i++){
            System.out.println("Enter number");
            IntList[i] = keyedInput.nextInt();
        }
        System.out.print(IntList[0]+" ");
        System.out.print(IntList[1]+" ");
        System.out.print(IntList[2]+" ");
        System.out.print(IntList[3]+" ");
        System.out.print(IntList[4]+" ");
        System.out.print(IntList[5]+" ");
        System.out.print(IntList[6]+" ");
        System.out.print(IntList[7]+" ");
        System.out.print(IntList[8]+" ");
        System.out.print(IntList[9]+" ");
        System.out.print(IntList[10]+" ");
        System.out.print(IntList[11]+" ");
        System.out.print(IntList[12]+" ");
        System.out.print(IntList[13]+" ");
        //Now print in reversed order
        System.out.print(IntList[13]+" ");
        System.out.print(IntList[12]+" ");
        System.out.print(IntList[11]+" ");
        System.out.print(IntList[10]+" ");
        System.out.print(IntList[9]+" ");
        System.out.print(IntList[8]+" ");
        System.out.print(IntList[7]+" ");
        System.out.print(IntList[6]+" ");
        System.out.print(IntList[5]+" ");
        System.out.print(IntList[4]+" ");
        System.out.print(IntList[3]+" ");
        System.out.print(IntList[2]+" ");
        System.out.print(IntList[1]+" ");
        System.out.print(IntList[0]+" ");
    }
    
}
