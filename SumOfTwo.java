import java.util.Scanner;
public class SumOfTwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//connect input stream "System.in"
        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        // Calculate sum of two numbers
        int sum = a + b;
        System.out.print("sum:" + sum);
    }
}
