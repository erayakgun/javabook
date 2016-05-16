package Chapter_02;

import java.util.Scanner;
/**
 * (Convert pounds into kilograms) Write a program that converts pounds into kilograms.
 * The program prompts the user to enter a number in pounds, converts it to
 * kilograms, and displays the result. One pound is 0.454 kilograms.
 */
public class PE_02_04_Convert_pounds_into_kilograms {
    public static void main(String[] args) {
        final Scanner SCANNER = new Scanner(System.in);
        double pounds;
        double kilograms;

        System.out.print("Enter a number in pounds: ");
        pounds = SCANNER.nextDouble();

        kilograms = pounds * 0.454d;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
    }
}
