import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date in the format YYYY-MM-DD: ");
        String shortDate = scanner.nextLine();

        int year = Integer.parseInt(shortDate.substring(0, 4));
        int month = Integer.parseInt(shortDate.substring(5, 7));
        int day = Integer.parseInt(shortDate.substring(8, 10));

        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String monthName = monthNames[month - 1]
        System.out.println(monthName + " " + day + ", " + year);
    }
}