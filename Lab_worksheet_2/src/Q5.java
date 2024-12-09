import java.util.StringTokenizer;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        if (isSentencePalindrome(sentence)) {
            System.out.println("\"" + sentence + "\" is a palindrome.");
        } else {
            System.out.println("\"" + sentence + "\" is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isSentencePalindrome(String sentence) {

        StringTokenizer tokenizer = new StringTokenizer(sentence, " ,.!?;:");

        StringBuilder cleaned = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            cleaned.append(tokenizer.nextToken().toLowerCase());
        }

        String cleanedString = cleaned.toString();
        String reversedString = cleaned.reverse().toString();

        return cleanedString.equals(reversedString);
    }
}
