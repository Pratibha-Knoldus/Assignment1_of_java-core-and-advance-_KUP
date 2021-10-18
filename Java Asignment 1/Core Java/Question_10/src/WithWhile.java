import java.util.Scanner;

public class WithWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "";

        while (!word.equals("done")){
            System.out.println("\nEnter a word");
            word = sc.next();
            if (word.equals("done")){
                break;
            }
            if (word.charAt(0) == word.charAt(word.length()-1)){
                System.out.println("The First and Last character matches in " + word + "");
            }
            else {
                System.out.println("The First and Last character does not matches in " + word + "");
            }

        }
    }
}
