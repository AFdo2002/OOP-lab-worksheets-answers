package Q5;//Question No: 5

public class CircularRegion {
    public static void main(String[] args) {
        Circle outerCircle = new Circle(5);
        Circle innerCircle = new Circle(3);

        double area = outerCircle.computeArea() - innerCircle.computeArea();
        System.out.printf("The area of the circular region is: %.2f\n", area);
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}