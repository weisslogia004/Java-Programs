public class StudentPortal {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java StudentPortal <country>");
            return;
        }
        
        String country = args[0];
        
        if (!country.equalsIgnoreCase("Indian")) {
            throw new IllegalArgumentException("User must be located in India.");
        }
        
        System.out.println("User location is valid.");
    }
}
