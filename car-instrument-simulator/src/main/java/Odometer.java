public class Odometer {

    private int mileage;

    public Odometer(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public void outMileage() {
        System.out.println("Текущий пробег автомобиля: " + mileage);
    }

    public void increaseMileage() {
        if(mileage == 999999) {
            mileage = 0;
        } else {
            mileage++;
        }
    }
}
