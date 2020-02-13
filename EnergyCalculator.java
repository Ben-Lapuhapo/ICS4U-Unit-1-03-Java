/****************************************************************************
 *
 * Created by: James Lee
 * Created on : Feb 2019
 * Created for : ICS4U
 * Last Modified on: Feb 2019
 * This program calculates the energy released by a certain mass
 * specified by the user
 *
 ****************************************************************************/

import java.util.Scanner;

public class EnergyCalculator {
    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);

        // Variables
        double speedOfLight;
        double energy;
        double mass;

        speedOfLight = 2.998 * Math.pow(10,8);

        System.out.print("Enter mass of object in kilograms : ");

        // Checks if the user's input is valid
        mass = userInput.nextDouble();
        if (mass <= 0) {
            System.out.println("Not a valid input.");
        } else {

            // Calculates the energy released using Einstein's formula
            energy = mass * Math.pow(speedOfLight,2);

            // Shows answer in scientific notation, accurate to three decimal places
            System.out.printf("The energy released is " + String.format("%6.3e",energy) + " Joules. ");
        }
    }
}