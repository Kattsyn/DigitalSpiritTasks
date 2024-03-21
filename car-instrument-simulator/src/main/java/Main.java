public class Main {
    public static void main(String[] args) {

        FuelGauge fuelGauge = new FuelGauge(0);
        Odometer odometer = new Odometer(0);
        Car car = new Car(10, fuelGauge, odometer);

        car.fillFuelGauge(60);
        car.drive();
    }
}
