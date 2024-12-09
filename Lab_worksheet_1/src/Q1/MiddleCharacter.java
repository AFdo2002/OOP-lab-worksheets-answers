package Q1;//Question No: 1

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an odd-length word: ");
        String word = scanner.nextLine();

        if (word.length() % 2 == 0) {
            System.out.println("Please enter a word with an odd number of characters.");
        } else {

            int middleIndex = word.length() / 2;

            char middleChar = word.charAt(middleIndex);
            System.out.println("The middle character is: " + middleChar);
        }

        scanner.close();
    }
}
