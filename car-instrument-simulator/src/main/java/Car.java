public class Car {

    private int fuelConsumption;
    private FuelGauge fuelGauge;
    private Odometer odometer;

    public Car(int fuelConsumption, FuelGauge fuelGauge, Odometer odometer) {
        this.fuelConsumption = fuelConsumption;
        this.fuelGauge = fuelGauge;
        this.odometer = odometer;
    }

    public void fillFuelGauge(int fuelVolume) {
        for(int i = 0; i < fuelVolume; i++) {
            fuelGauge.fillFuel();
            fuelGauge.outCurrentFuelVolume();
            if (fuelGauge.isFull()) {
                return;
            }
        }
    }

    public void drive() {
        int distanceDriven = 0;
        while (!fuelGauge.isEmpty()) {
            odometer.outMileage();
            odometer.increaseMileage();
            if(distanceDriven/fuelConsumption > (distanceDriven-1)/fuelConsumption) {
                fuelGauge.consumeFuel();
                fuelGauge.outCurrentFuelVolume();
            }
            distanceDriven++;
        }
    }
}
