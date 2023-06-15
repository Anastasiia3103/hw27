package builder;

public class Main {
    public static void main(String[] args) {
        Car.CarBuilder carBuilder = new Car.CarBuilder();
        Car car = carBuilder
                .setMake("Mazda")
                .setModel("6")
                .setYear(2022)
                .build();

        System.out.println("The car is a " + car.getMake() + " " + car.getModel() + " from " + car.getYear());
    }
}