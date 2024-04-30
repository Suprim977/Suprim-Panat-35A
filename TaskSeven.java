public class TaskSeven {
    public static void main(String[] args) {
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
    }
}
