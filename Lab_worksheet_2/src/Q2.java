import java.util.Scanner;

public class Q2 {

    public static int noOfDigits (int n){
        String m = String.valueOf(n);
        return m.length();
    }

    public static void main(String[] args) {
        int x = 0;
        do {
            System.out.print("Enter the number: ");
            Scanner scanner = new Scanner(System.in);

            if (scanner.hasNextInt()){
                 x = scanner.nextInt();
                 if (x<0){
                     System.out.println("You entered a negative number!\nProgram stopped.");
                     break;
                 }
                 else{
                     System.out.println("Number of digits: "+noOfDigits(x));
                 }

            }
            else{
                System.out.println("Please enter an integer!");
            }

        } while (true);

    }

}

