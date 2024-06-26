import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Task 1: Find maximum between three numbers
        int a = 10;
        int b = 20;
        int c = 30;
        if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (b > a && b > c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }

        // Task 2: Check whether a number is negative, positive, or zero
        int number = -5;
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println(number + " is zero.");
        }

        // Task 3: Check whether a number is divisible by 5 and 11 or not
        int n = 10;
        if (n % 5 == 0 && n % 11 == 0) {
            System.out.println("Number is divisible by 5 and 11");
        } else {
            System.out.println("Number is not divisible by 5 and 11");
        }

        // Task 5: Check whether a year is a leap year or not
        int year = 2020;
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("Leap Year");
            } else if (year % 400 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        } else {
            System.out.println("Not a Leap Year");
        }

        // Task 6: Check whether an alphabet is a vowel or consonant
        char ch = 'i';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is vowel");
        } else {
            System.out.println(ch + " is consonant");
        }

        // Task 7: Convert student's grade to GPA value
        String grade = "B";
        switch (grade) {
            case "A+":
                System.out.println("Student has scored between 90 to 100");
                break;
            case "A":
                System.out.println("Student has scored between 80 to 90");
                break;
            case "B":
                System.out.println("Student has scored between 70 to 80");
                break;
            case "C":
                System.out.println("Student has scored between 60 to 70");
                break;
            case "D":
                System.out.println("Student has scored between 50 to 60");
                break;
            default:
                System.out.println("Invalid grade");
        }

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

        // Task 9: Print corresponding season based on month input
        int month = 12;
        if (month < 1 || month > 12) {
            System.out.println("Invalid input. Please enter a number between 1 and 12.");
        } else {
            String season;
            switch (month) {
                case 12:
                case 1:
                case 2:
                    season = "Winter";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "Spring";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Summer";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "Fall";
                    break;
                default:
                    season = "Invalid month";
            }
            System.out.println("The season for month " + month + " is: " + season);
        }

        // Task 10: Calculate area of different shapes based on user's choice
        System.out.println("Enter c to calculate area of circle");
        System.out.println("Enter s to calculate area of square");
        System.out.println("Enter r to calculate area of rectangle");
        System.out.print("Enter your choice: ");
        char choice = input.next().charAt(0);

        switch (choice) {
            case 'c':
                System.out.print("Enter radius of circle: ");
                double r = input.nextDouble();
                double ca = (22 / 7.0) * r * r;
                System.out.println("Area of circle = " + ca);
                break;
            case 's':
                System.out.print("Enter side of square: ");
                double side = input.nextDouble();
                double sa = side * side;
                System.out.println("Area of square = " + sa);
                break;
            case 'r':
                System.out.print("Enter length of rectangle: ");
                double l = input.nextDouble();
                System.out.print("Enter breadth of rectangle: ");
                double b = input.nextDouble();
                double ra = l * b;
                System.out.println("Area of rectangle = " + ra);
                break;
