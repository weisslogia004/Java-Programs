import java.util.Scanner;
public class SentenceCase 
{

   public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");

        String sentence = scanner.nextLine();

        String output = "";

        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            if (i == 0 || sentence.charAt(i - 1) == ' ') {

                output = output + Character.toUpperCase(ch);

            } else {

                output = output + ch;

            }

        }

        System.out.println("Output: " + output);

    }

}
