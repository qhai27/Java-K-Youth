public class Assignment1 {
    private int manufactureYear;
    private double price;
    private String name;

    public Assignment1(int manufactureYear, double price, String name) {
        this.manufactureYear = manufactureYear;
        this.price = price;
        this.name = name;
    }

    public double calculateValue() {
        return price * manufactureYear;
    }

    public void displayDetails() {
        System.out.println("Car Name: " + name);
        System.out.println("Manufacture Year: " + manufactureYear);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Create a car object
        Assignment1 car = new Assignment1(2002, 50000, "Myvi");
        car.displayDetails();
        System.out.println("Calculated Value (Price * Year): " + car.calculateValue());
    }
}