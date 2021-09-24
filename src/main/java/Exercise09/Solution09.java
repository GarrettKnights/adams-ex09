/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Garrett Adams
 */

package Exercise09;

import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {

        //Initializes scanner
        Scanner ScanWord = new Scanner(System.in);

        //Declares ints we will be using
        double length;
        double width;
        double conversion = 350;
        double sqft;

        //Asks user for input
        System.out.print("What is the length?");
        //Scans length input
        length = ScanWord.nextDouble();
        //Asks user for input
        System.out.print("What is the width?");
        //Scans width input
        width = ScanWord.nextDouble();
        //Calculates square feet
        sqft = length * width;

        //Calculates how many gallons we need
        int gal = (int)Math.ceil(sqft/conversion);

        System.out.println("You will need to purchase " + gal + " gallons of paint to cover " + sqft + " square feet");

    }
}
