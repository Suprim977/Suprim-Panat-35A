import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
                // Task 8: Perform arithmetic operation based on user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number: ");
        int n2 = input.nextInt();
        System.out.print("Give me an operator (+, -, *, /): ");
        String o = input.next();
        input.close();
        switch (o) {
            case "+":
                System.out.println(n1 + n2);
                break;
            case "-":
                System.out.println(n1 - n2);
                break;
            case "*":
                System.out.println(n1 * n2);
                break;
            case "/":
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("Error, invalid operand.");
        }
    }
}
