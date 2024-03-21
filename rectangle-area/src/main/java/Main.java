import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float x1 = scanner.nextFloat();
        float y1 = scanner.nextFloat();
        float x2 = scanner.nextFloat();
        float y2 = scanner.nextFloat();
        //Math.floor(sum * 10) / 10;
        float result = Math.abs(x2 - x1) * Math.abs(y2 - y1);
        System.out.println(Math.floor(result * 10) / 10);
    }
}