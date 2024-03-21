import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = scanner.nextInt() % 1440;

        System.out.println(minutes / 60 + ":" + minutes % 60);
    }
}