public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("C001", "Toyota", "Corolla", 3000);

        System.out.println(car1);

        if (car1.rentCar()) {
            System.out.println("Car rented successfully!");
        } else {
            System.out.println("Car not available.");
        }

        System.out.println(car1);

        car1.returnCar();
        System.out.println("Car returned.");
        System.out.println(car1);
    }
}
