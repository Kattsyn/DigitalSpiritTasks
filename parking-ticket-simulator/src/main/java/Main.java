public class Main {
    public static void main(String[] args) {
        ParkedCar parkedCar = new ParkedCar(
                "Toyota", "Sprinter Marino",
                "Grey", "H319EP136", 105);
        ParkingMeter parkingMeter = new ParkingMeter(40);
        PoliceOfficer policeOfficer = new PoliceOfficer("Artyom", 1337);

        policeOfficer.checkParkTime(parkedCar, parkingMeter);
    }
}
