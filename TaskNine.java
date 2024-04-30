public class TaskNine {
    public static void main(String[] args) {
                // Task 9: Print corresponding season based on month input
        int month = 5;
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
    }
}
