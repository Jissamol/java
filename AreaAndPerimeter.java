import java.util.Scanner;
public class AreaAndPerimeter {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        float length = input.nextFloat();

        System.out.print("Enter breadth of rectangle: ");
        float breadth = input.nextFloat();

        float area = length * breadth;
        float perimeter = 2 * (length + breadth);

        System.out.println("Area of rectangle:" + area);
        System.out.println("Perimeter of rectangle:" + perimeter);
    }
}
