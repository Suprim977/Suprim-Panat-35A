public class TaskFive {
    public static void main(String[] args) {
                // Task 5: Check whether a year is a leap year or not
                int year = 2024;
                if(year % 4 == 0) {
                    if(year % 100 != 0) {
                     System.out.println("Leap Year");
                    } else if(year % 400 == 0) {
                        System.out.println("Leap Year");
                    } else {
                        System.out.println("Not a Leap Year");
                    }
                } else {
                    System.out.println("Not a Leap Year");
                }
    }
}
