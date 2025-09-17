import java.util.Scanner;
public class VowelorConsonantChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character:");
        char vowel = sc.next().toLowerCase().charAt(0);
        if ((vowel >= 'a' && vowel <= 'z')) {
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
                System.out.println("The entered character is vowel");
            } else {
                System.out.println("The entered character is not vowel");
            }
        }
    }

    }
