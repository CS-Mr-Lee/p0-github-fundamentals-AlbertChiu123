/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics4u1.gr.pkg11.concepts;
import java.util.Scanner;
/**
 *
 * @author alber_3d0phb2
 */
public class InputMath {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Variables for user's birthday, current date and final results
        Scanner keyedInput = new Scanner(System.in);
        int BirthYear;
        int BirthMonth;
        int BirthDay;
        int BirthDayTotal = 0;
        int CurrentYear;
        int CurrentMonth;
        int CurrentDay;
        int CurrentDayTotal = 0;
        int Difference = 0;
        int SleepHours = 0;
        
    //Ask the user to enter user's birthday
        System.out.println("This program will calculate the numbers of hours of your life that you have spent for sleeping");
        System.out.println("Enter your birthday");
        System.out.println("Year:");
        BirthYear = keyedInput.nextInt();
        System.out.println("Month:");
        BirthMonth = keyedInput.nextInt();
        System.out.println("Day:");
        BirthDay = keyedInput.nextInt();
    //Ask user to enter the current
        System.out.println("Enter the current date");
        System.out.println("Year:");
        CurrentYear = keyedInput.nextInt();
        System.out.println("Month:");
        CurrentMonth = keyedInput.nextInt();
        System.out.println("Day:");
        CurrentDay = keyedInput.nextInt();
        
    //Find the different between the current date and the user's birthday
        BirthDayTotal = (365 * BirthYear) + (30 * BirthMonth) + BirthDay;
        CurrentDayTotal = (365 * CurrentYear) + (30 * CurrentMonth) + CurrentDay;
        Difference = CurrentDayTotal - BirthDayTotal;
    //Find how how lifetime user had spent for sleeping
        SleepHours = Difference * 8;
        
    //Show result to the user
        System.out.println("You have lived for "+ Difference +" days");
        System.out.println("You have slept for "+ SleepHours +" hours");
    }
}
