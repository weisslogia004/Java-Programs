public class MathOperation {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Please provide exactly 5 integers as arguments.");
            return;
        }
        
        int[] numbers = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
                sum += numbers[i];
            } catch (NumberFormatException e) {
                System.out.println("Error: All arguments must be valid integers.");
                return;
            }
        }
        
        double average = sum / 5.0;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
