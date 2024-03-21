public class ParkingTicket {

    private ParkedCar parkedCar;
    private PoliceOfficer policeOfficer;
    private int overdueTime;
    private int fineAmount;

    public ParkingTicket(ParkedCar parkedCar, PoliceOfficer policeOfficer, int overdueTime) {
        this.parkedCar = parkedCar;
        this.policeOfficer = policeOfficer;
        this.overdueTime = overdueTime;
        calculateFineAmount();
    }

    private void calculateFineAmount() {
        if (overdueTime <= 60) {
            fineAmount = 25;
        } else {
            fineAmount = 25;
            overdueTime -= 60;
            while (overdueTime > 0) {
                fineAmount += 10;
                overdueTime -= 60;
            }
        }
    }

    public void outTicketInfo() {
        parkedCar.outCarInfo();
        System.out.println("Fined " + fineAmount + "$ for overstaying parking.");
        System.out.print("Fined by: ");
        policeOfficer.outOfficerInfo();
    }
}
