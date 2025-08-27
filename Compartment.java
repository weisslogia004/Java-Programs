public class Compartment {
    private double height;
    private double width;
    private double breadth;

    public Compartment(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double calculateVolume() {
        return height * width * breadth;
    }

    public static void main(String[] args) {
        Compartment compartment = new Compartment(10.0, 5.0, 2.0);
        System.out.println("Height: " + compartment.getHeight());
        System.out.println("Width: " + compartment.getWidth());
        System.out.println("Breadth: " + compartment.getBreadth());
        System.out.println("Volume: " + compartment.calculateVolume());
    }
}
