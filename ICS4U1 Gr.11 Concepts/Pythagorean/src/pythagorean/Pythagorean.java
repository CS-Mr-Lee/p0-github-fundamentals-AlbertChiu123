/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorean;
import java.util.Scanner;
/**
 *
 * @author alber_3d0phb2
 */
public class Pythagorean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variable for user's input, Pythagorean Triplet and their sum
        Scanner keyedInput = new Scanner(System.in);
        int UserInput;
        int FirstTriplet = 1;
        int SecondTriplet = 2;
        int ThirdTriplet = 0;
        System.out.println("This program will ask you to enter any integer, and will use The Pythagorean");
        System.out.println("to determine whether the third triplet is more than or equal to that number");
        System.out.println("Enter your number:");
        UserInput = keyedInput.nextInt();
        //Find the third triplet
        while(UserInput - ThirdTriplet != 0 || UserInput - ThirdTriplet > 0){
            FirstTriplet += 1;
            SecondTriplet += 1;
            ThirdTriplet = FirstTriplet * FirstTriplet + SecondTriplet * SecondTriplet;
        }
        System.out.print(ThirdTriplet);
    }
    
}
