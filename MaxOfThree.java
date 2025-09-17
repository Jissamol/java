import java.util.Scanner;
public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, max;
        System.out.print("Enter three numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println("Maximum = " + max);
    }
}

