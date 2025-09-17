import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the mark: ");
        int mark = input.nextInt();
        if (mark > 90){
            System.out.print("S Grade");
        } else if (mark > 80) {
            System.out.print("A Grade");
        } else if (mark > 70) {
            System.out.print("B Grade");
        } else if (mark > 60) {
            System.out.print("C Grade");
        }else if (mark > 50) {
            System.out.print("D Grade");
        }else {
            System.out.print("Failed");
        }
    }
}