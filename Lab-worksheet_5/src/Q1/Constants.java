package Q1;

public class Constants {
    // Declare final constants
    public static final double PI = 3.14159;
    public static final int SPEED_OF_LIGHT = 299792458; // meters per second
    public final double GRAVITY;

    // Constructor to initialize GRAVITY
    public Constants(double gravity) {
        this.GRAVITY = gravity;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Instantiate the Q1.Constants class with a GRAVITY value
        Constants constants = new Constants(9.81);

        // Display the constants
        System.out.println("PI: " + Constants.PI);
        System.out.println("Speed of Light: " + Constants.SPEED_OF_LIGHT + " m/s");
        System.out.println("Gravity: " + constants.GRAVITY + " m/s^2");
    }
}
