import java.util.Scanner;
public class SICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal amount (P): ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest (R): ");
        double rate = input.nextDouble();

        System.out.print("Enter Time in years (T): ");
        double time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + simpleInterest);
    }

}
