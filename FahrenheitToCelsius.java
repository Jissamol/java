import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double F = input.nextDouble();

        double Celsius = 5.0 / 9 *(F - 32);
        System.out.print("Celsius:" + Celsius);

    }
}