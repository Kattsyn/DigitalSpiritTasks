import java.util.Scanner;

public class RegularPolygon {

    public static double area(int n, double side) {
        return (n*side*side)/(4*Math.tan(Math.PI/n));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double side = scanner.nextDouble();

        if (side <= 0 || n <= 2) {
            System.out.println("NO");
        } else {
            System.out.println(area(n, side));
        }
    }
}
