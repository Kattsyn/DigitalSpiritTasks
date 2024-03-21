import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = scanner.nextDouble();
        double discount = 0;
        double sum = 0;
        double sumWithoutDiscount = 0;

        while(price >= 0) {
            if (price >= 1000) {
                discount += price * 0.05;
                sum += price * 0.95;
            } else {
                sum += price;
            }
            sumWithoutDiscount += price;
            price = scanner.nextDouble();
        }
        System.out.println(Math.floor(sumWithoutDiscount * 100) / 100 + " " + Math.floor(sum * 100) / 100 + " " + Math.floor(discount * 100) / 100);
    }
}