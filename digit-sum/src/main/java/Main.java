import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int sum = num / 100 + num / 10 % 10 + num % 10;
        System.out.println(sum);
    }
}