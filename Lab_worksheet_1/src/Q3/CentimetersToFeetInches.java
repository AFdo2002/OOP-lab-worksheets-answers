package Q3;//Question No: 3

import java.util.Scanner;

public class CentimetersToFeetInches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length in centimeters: ");
        double centimeters = scanner.nextDouble();

        double inches = centimeters / 2.54;
        double feet = inches / 12;

        int wholeFeet = (int) feet;

        double remainingInches = inches % 12;

        System.out.printf("The length is approximately: %d feet and %.2f inches\n", wholeFeet, remainingInches);

        scanner.close();
    }
}
