import java.util.Scanner;
public class SwapTwoVariable {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter first number(a): ");
        int a = input.nextInt();

        System.out.print("Enter second number(b): ");
        int b = input.nextInt();

        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("num1=" + a );
        System.out.println("num2=" + b);

    }
}
