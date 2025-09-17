import java.util.Scanner;
public class SwapWithoutThirdVariable {
        public static void main(String[] args) {
            Scanner input =  new Scanner(System.in);

            System.out.print("Enter first number(a): ");
            int a = input.nextInt();
            System.out.print("Enter second number(b): ");
            int b = input.nextInt();

            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("a=" + a);
            System.out.println("b=" +b);
    }

}
