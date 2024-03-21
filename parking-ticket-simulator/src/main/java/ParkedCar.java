public class ParkedCar {

    private String color;
    private String model;
    private String brand;
    private String licensePlate;
    private int parkedTime;

    public ParkedCar(String brand, String model, String color, String licensePlate, int parkedTime) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.licensePlate = licensePlate;
        this.parkedTime = parkedTime;
    }

    public void outCarInfo() {
        System.out.println("Car info: "
                + brand + " "
                + model + " "
                + color + " "
                + licensePlate);
    }

    public int getParkedTime() {
        return parkedTime;
    }
}
