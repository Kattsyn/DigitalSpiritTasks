public class PoliceOfficer {

    String policeBadgeName;
    int policeBadgeNum;

    public PoliceOfficer(String policeBadgeName, int policeBadgeNum) {
        this.policeBadgeNum = policeBadgeNum;
        this.policeBadgeName = policeBadgeName;
    }

    public void checkParkTime(ParkedCar parkedCar, ParkingMeter parkingMeter) {
        if (parkingMeter.getPayedParkingTime() < parkedCar.getParkedTime()) {
            ParkingTicket parkingTicket =  new ParkingTicket(parkedCar,this,
                    parkedCar.getParkedTime() - parkingMeter.getPayedParkingTime());
            parkingTicket.outTicketInfo();
        }
    }


    public void outOfficerInfo() {
        System.out.println("Officer " + policeBadgeName + ". Badge num: " + policeBadgeNum);
    }

}
