import java.util.Scanner;
public class LeapYearCheck {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Input the year
            System.out.print("Enter a year: ");
            int year = input.nextInt();

            // Check leap year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is Not a Leap Year.");
            }
    }
}
