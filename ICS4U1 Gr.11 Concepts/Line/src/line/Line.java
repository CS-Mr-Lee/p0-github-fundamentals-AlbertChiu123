/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package line;
import java.util.Scanner;
/**
 *
 * @author alber_3d0phb2
 */
public class Line {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        // Variables for x-intercepts and y-intercepts
        double xInt;
        double yInt;
        double xInt2;
        double yInt2;
        double Length;
        double Slope;
        //Ask user to enter x1, y1, x2, and y2 of the line segment
        System.out.println("This program will calculate and find the length and slope bewtween the x-intercepts and y-intercepts you entered");
        System.out.println("Enter first x-intercepts:");
        xInt = keyedInput.nextDouble();
        System.out.println("Enter first y-intercepts:");
        yInt = keyedInput.nextDouble();
        System.out.println("Enter second x-intercepts:");
        xInt2 = keyedInput.nextDouble();
        System.out.println("Enter second y-intercepts:");
        yInt2 = keyedInput.nextDouble();
        //find the different
        Length = Math.round(Math.pow((xInt2 - xInt), 2) + Math.pow((yInt2 - yInt), 2) * 1000.0) / 1000.0;
        System.out.println("The distance between your line segments is "+ Length);
        Slope = Math.round((yInt2 - yInt) / (xInt2 - xInt) * 1000.0) / 1000.0;
        System.out.println("The slope between your line segments is "+ Slope);
    }
    
}
