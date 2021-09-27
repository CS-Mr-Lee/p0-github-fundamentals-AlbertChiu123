/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leasttwopower;
import java.util.Scanner;
/**
 *
 * @author alber_3d0phb2
 */
public class LeastTwoPower {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Scanner keyedInput = new Scanner(System.in);
        int UserInt;
        int PowerTotal = 1;
        //Tell the user the instruction and ask for positive number
        System.out.println("This program reads positive integer and show you the least");
        System.out.println("power of two that is greater or equal to the number you entered");
        System.out.println("Enter your number:");
        UserInt = keyedInput.nextInt();
        //Find the least power of two for that number
        if(UserInt - PowerTotal != 0 || UserInt - PowerTotal >= 0){
            do{
                PowerTotal = PowerTotal * 2;
            }while(UserInt - PowerTotal != 0 || UserInt - PowerTotal >= 0);
        }

        //output outcome
        System.out.println("The least power of two for this number is "+ PowerTotal);
    }
}
