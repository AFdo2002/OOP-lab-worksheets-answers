import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        System.out.print("Enter the number of rows in the pyramid: ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for (int i=0; i<rows; i++ ){

            for (int n=(rows-i); n>0; n--){
                System.out.print("  ");
            }

            for (int j=0; j<((2*i)+1); j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        scanner.close();
    }
}
