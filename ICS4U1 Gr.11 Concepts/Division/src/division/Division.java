/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package division;
import java.util.Scanner;
/**
 *
 * @author alber_3d0phb2
 */
public class Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        //Variable for numerator, divisor and result
        String Input;
        int Numerator;
        int Divisor;
        double result;
        result = 0;
        //Introduction
        System.out.println("This program will ask you to enter a numerator and a divisor, then print the sum of division");
        System.out.println("");
        System.out.println("Enter numerator:");
        Input = keyedInput.nextLine();
        Numerator = Integer.parseInt(Input);
        System.out.println("Enter divisor:");
        Divisor = keyedInput.nextInt();
        while (!"Q".equals(Input) || !"q".equals(Input)){
            Numerator = Integer.parseInt(Input);
            result = Numerator / Divisor;
            System.out.println(Numerator +" / "+ Divisor +" is "+ result);
            System.out.println("");
            System.out.println("");
            System.out.println("Enter numerator:");
            Input = keyedInput.nextLine();
            Numerator = Integer.parseInt(Input);
            System.out.println("Enter divisor:");
            Divisor = keyedInput.nextInt();
            if (Divisor == 0){
                System.out.println("You can't divide"+ Numerator +"with 0");
                System.out.println("");
                System.out.println("");
                System.out.println("Enter numerator:");
                Input = keyedInput.nextLine();
                Numerator = Integer.parseInt(Input);
                System.out.println("Enter divisor:");
                Divisor = keyedInput.nextInt();
            }
        }
        System.out.println("Thank you for using this program");
    }
    
}
