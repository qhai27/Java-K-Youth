import java.util.Scanner;

public class ScannerCar {

    // Public Car class to store model, make, and price
    public static class Car {
        public String model;
        public String make;
        public double price;

        public Car(String model, String make, double price) {
            this.model = model;
            this.make = make;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalPrice = 0;
        int carCount = 3;

        System.out.println("Enter details for " + carCount + " cars:");

        // Loop to input car details and calculate total price
        for (int i = 1; i <= carCount; i++) {
            System.out.println("Car " + i + ":");

            System.out.print("Enter Model: ");
            String model = sc.nextLine();

            System.out.print("Enter Make: ");
            String make = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // Clear the newline character from the buffer

            // Create a Car object and add its price to the total
            Car car = new Car(model, make, price);
            totalPrice += car.price;

            // Display the car details
            System.out.println("Model: " + car.model + ", Make: " + car.make + ", Price: " + car.price);
        }

        // Calculate and display the average price
        double averagePrice = totalPrice / carCount;
        System.out.printf("\nAverage Price of Cars: %.2f\n", averagePrice);

        sc.close();
    }
}
