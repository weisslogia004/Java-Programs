public class PersonValidator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java PersonValidator <name> <age>");
            return;
        }
        
        String name = args[0];
        int age = 0;
        
        try {
            age = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Age must be an integer.");
            return;
        }

        if (age < 18 || age >= 60) {
            System.out.println("Error: Age must be >= 18 and < 60.");
            return;
        }
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
