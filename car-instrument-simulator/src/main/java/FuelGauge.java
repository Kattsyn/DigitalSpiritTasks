public class FuelGauge {

    private int currentFuelVolume;
    private final int MAX_VOLUME = 50;

    public FuelGauge(int currentFuelVolume) {
        this.currentFuelVolume = currentFuelVolume;
    }

    public void outCurrentFuelVolume() {
        System.out.println("Текущий объем бака: " + currentFuelVolume);
    }

    public int getCurrentFuelVolume() {
        return currentFuelVolume;
    }

    public boolean isFull() {
        return currentFuelVolume == MAX_VOLUME;
    }

    public boolean isEmpty() {
        return currentFuelVolume == 0;
    }

    public void fillFuel() {
        if (currentFuelVolume >= MAX_VOLUME) {
            System.out.println("Бак уже полон.");
        } else if (currentFuelVolume == MAX_VOLUME - 1) {
            currentFuelVolume++;
            System.out.println("Бак заполнен.");
        } else {
            currentFuelVolume++;
            System.out.println("Объем топлива увеличен на 1л.");
        }
    }

    public void consumeFuel() {
        if (currentFuelVolume == 0) {
            System.out.println("Бак пуст.");
        } else if (currentFuelVolume == 1) {
            currentFuelVolume--;
            System.out.println("Бак опустел.");
        } else {
            currentFuelVolume--;
            System.out.println("Объем топлива уменьшен на 1л.");
        }
    }
}
