import java.util.Scanner;

class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter name of student 1: ");
            String name1 = scanner.nextLine();
            int[] marks1 = getMarks(scanner);

            System.out.print("Enter name of student 2: ");
            String name2 = scanner.nextLine();
            int[] marks2 = getMarks(scanner);

            double average1 = calculateAverage(marks1);
            double average2 = calculateAverage(marks2);

            System.out.println("Average marks of " + name1 + ": " + average1);
            System.out.println("Average marks of " + name2 + ": " + average2);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer values for marks.");
        } catch (NegativeValueException | OutOfRangeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static int[] getMarks(Scanner scanner) throws NegativeValueException, OutOfRangeException {
        int[] marks = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            int mark = Integer.parseInt(scanner.nextLine());

            if (mark < 0) {
                throw new NegativeValueException("Error: Marks cannot be negative.");
            }

            if (mark > 100) {
                throw new OutOfRangeException("Error: Marks must be within the range of 0 to 100.");
            }

            marks[i] = mark;
        }
        return marks;
    }

    private static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
}
