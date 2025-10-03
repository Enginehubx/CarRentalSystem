public class Car {
    private String carId;
    private String brand;
    private String model;
    private double rentalPricePerDay;
    private boolean isAvailable;

    public Car(String carId, String brand, String model, double rentalPricePerDay) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = true; // new cars are available by default
    }

    public boolean rentCar() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public void returnCar() {
        isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Car ID: " + carId + ", " + brand + " " + model +
               ", Price/Day: " + rentalPricePerDay +
               ", Available: " + (isAvailable ? "Yes" : "No");
    }
}
