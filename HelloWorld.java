public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("This");
        System.out.print("Is\n");
        System.out.print("\"Java\"");
        // single line comment, ignored in execution
        System.out.println("Next Line");
        /* Multi line comment, ignored in execution */
        System.out.println("End");
        /** Javadoc, this is for documentation purpose */

        // Task1
        // Print the following using System.out.print()
        // This is's
        // my first
        // "Java" program
        System.out.print("This is's\n");
        System.out.print("my first\n");
        System.out.print("\"Java\" program\n");


        // Task 2
        // Print the following using only one System.out.print()
        // You can do this"s
        // in a 'single'
        // Line of "print"

        System.out.println("You can do this\"s in a 'single'line of \"print\"");

        // Task 3
        // Print the following
        // "*"
        // \**\
        // '***'
        // "*"'*'"*"'*'
        // "*""*""*""*""*"

        System.out.println("\"*\"");
        System.out.println("\\**\\");
        System.out.println("'***'");
        System.out.println("\"*\"'\"*\"'\"*\"");
        System.out.println("\"*\"\"*\"\"*\"\"*\"\"*\"");

    }
}

class Task3 {
    public static void main(String[] args) {
        System.out.println("\nA \"quoted\" String is");
        System.out.println("'much' better if you learn");
        System.out.println("the rules of \"escape sequences\"");
        System.out.println("Also, \"\" represents an empty");
        System.out.println("String. Don't forget: use \"\"");
        System.out.println("instead of \" !");
        System.out.println("'' is not the same as \" */");
    }
}

class Task4 {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
    }
}

class Task5 {
    public static void main(String[] args) {
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
    }
}

class Task6 {
    public static void main(String[] args) {
        System.out.println("A well-formed Java program has a main method with { and }\nbraces");
        System.out.println("\nA System.out.println statement has ( and ) and usually a\nString that starts and ends with a \" character.\n(But we type \\\" instead!)");
        System.out.println("What is the difference between\na ' and a \"? Or between a \" and a \\\"?");
        System.out.println("\nOne is what we see when we're typing our program.");
        System.out.println("The other is what we see when we're running our program.");
    }
}
