public class Main {
    public static void main(String[] args) {
        // Create Rental Agency
        RentalAgency agency = new RentalAgency();

        // Add Cars
        Car car1 = new Car("C001", "Toyota", "Corolla", 3000);
        Car car2 = new Car("C002", "Honda", "Civic", 3500);
        Car car3 = new Car("C003", "Nissan", "X-Trail", 5000);
        agency.addCar(car1);
        agency.addCar(car2);
        agency.addCar(car3);

        // Add Customers
        Customer cust1 = new Customer("CU001", "Alice Kimani", "0712345678");
        Customer cust2 = new Customer("CU002", "John Mwangi", "0723456789");
        agency.addCustomer(cust1);
        agency.addCustomer(cust2);

        // Display Cars & Customers
        agency.showCars();
        System.out.println();
        agency.showCustomers();

        // Demonstrate renting a car
        System.out.println("\n--- Renting a Car ---");
        if (car1.rentCar()) {
            System.out.println(cust1.getName() + " rented " + car1);
        } else {
            System.out.println("Car is not available.");
        }

        // Return the car
        System.out.println("\n--- Returning a Car ---");
        car1.returnCar();
        System.out.println(cust1.getName() + " returned " + car1);
    }
}
