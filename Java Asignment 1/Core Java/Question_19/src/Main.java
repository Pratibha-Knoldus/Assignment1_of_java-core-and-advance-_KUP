import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumToEnglish ne = new NumToEnglish();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to convert in eng;ish form:");
        int number = sc.nextInt();
        System.out.println("After Conversion to English: ");
        System.out.println(ne.numberToWords(number));
    }
}
