import java.util.Scanner;
public class PositiveNegativeorZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        double val = sc.nextDouble();
        if (val == 0){
            System.out.println("The value is 0  ");
        } else if (val > 0){
            System.out.println("The value is Positive");
        }else {
            System.out.println("The value is Negative");
        }
    }
}
