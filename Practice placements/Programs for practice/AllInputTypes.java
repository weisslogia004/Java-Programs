import java.util.Scanner;
public class AllInputTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer input
        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();

        // Double input
        System.out.print("Enter a double: ");
        double doubleValue = sc.nextDouble();

        // Float input
        System.out.print("Enter a float: ");
        float floatValue = sc.nextFloat();

        // Long input
        System.out.print("Enter a long: ");
        long longValue = sc.nextLong();

        // Short input
        System.out.print("Enter a short: ");
        short shortValue = sc.nextShort();

        // Byte input
        System.out.print("Enter a byte: ");
        byte byteValue = sc.nextByte();

        // Boolean input
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = sc.nextBoolean();

        // String input (single word)
        System.out.print("Enter a word: ");
        String word = sc.next();

        // String input (line)
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter a line of text: ");
        String line = sc.nextLine();

        // Char input
        System.out.print("Enter a character: ");
        char charValue = sc.next().charAt(0);

        // Display all inputs
        System.out.println("\nYou entered:");
        System.out.println("Integer: " + intValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Long: " + longValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Byte: " + byteValue);
        System.out.println("Boolean: " + booleanValue);
        System.out.println("Word: " + word);
        System.out.println("Line: " + line);
        System.out.println("Character: " + charValue);
    }
}
