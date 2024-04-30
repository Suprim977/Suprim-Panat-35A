import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Initialize Scanner object
        // Task 10: Calculate area of different shapes based on user's choice
        System.out.println("Enter c to calculate area of circle");
        System.out.println("Enter s to calculate area of square");
        System.out.println("Enter r to calculate area of rectangle");
        System.out.print("Enter your choice: ");
        char choice = in.next().charAt(0);

        switch(choice) {
            case 'c':
                System.out.print("Enter radius of circle: ");
                double r = in.nextDouble();
                double ca = (22.0 / 7.0) * r * r; // Using a more accurate approximation of PI
                System.out.println("Area of circle = " + ca);
                break;
            case 's':
                System.out.print("Enter side of square: ");
                double side = in.nextDouble();
                double sa = side * side;
                System.out.println("Area of square = " + sa);
                break;
            case 'r':
                System.out.print("Enter length of rectangle: ");
                double l = in.nextDouble();
                System.out.print("Enter breadth of rectangle: ");
                double b = in.nextDouble();
                double ra = l * b;
                System.out.println("Area of rectangle = " + ra);
                break;
            default:
                System.out.println("Wrong choice!");
        }

        in.close(); // Close the Scanner object to prevent resource leak
    }
}
