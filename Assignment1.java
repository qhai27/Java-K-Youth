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
        double value = (price * manufactureYear) / 1000;
        System.out.println("Car Name: " + name);
        System.out.println("Manufacture Year: " + manufactureYear);
        System.out.println("Price: " + price);
        System.err.println("Value: " + value);

    }

    public static void main(String[] args) {
        Assignment1 car = new Assignment1(2002, 50000, "Myvi");
        car.displayDetails();
        
    }
}